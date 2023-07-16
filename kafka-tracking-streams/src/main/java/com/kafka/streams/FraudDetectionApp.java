package com.kafka.streams;

import com.hailu.kafka.model.Order;
import io.confluent.kafka.serializers.AbstractKafkaSchemaSerDeConfig;
import io.confluent.kafka.streams.serdes.avro.SpecificAvroSerde;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.Topology;
import org.apache.kafka.streams.kstream.KStream;

import java.util.Properties;

@Slf4j
public class FraudDetectionApp {
    public static final String PAYMENTS_TOPIC = "payments";

    public static void main(String[] args) {
        Properties props = new Properties();
        props.put(StreamsConfig.APPLICATION_ID_CONFIG, "fraud-detection-app");
        props.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9093, localhost:9094");
        props.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass().getName());
        props.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, SpecificAvroSerde.class);
        props.put(AbstractKafkaSchemaSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG, "http://localhost:8081");

        StreamsBuilder streamsBuilder = new StreamsBuilder();
        KStream<String, Order> stream = streamsBuilder.stream(PAYMENTS_TOPIC);
        // business logic
        stream.peek(FraudDetectionApp::printOnEnter)
                .filter((txnId, order) -> !order.getUserId().name().equals(""))
                .filter((txnId, order) -> order.getNbOfItems() < 1000)
                .filter((txnId, order) -> order.getTotalAmount() < 10000)
                .peek(FraudDetectionApp::printOnExit)
                .to("validated-payments");
        Topology topology = streamsBuilder.build();

        KafkaStreams streams = new KafkaStreams(topology, props);
        streams.start();
        Runtime.getRuntime().addShutdownHook(new Thread(streams::close));
    }

    private static void printOnEnter(String txnId, Order order) {
        log.info("\n******************************");
        log.info("ENTERING STREAM TXN WITH ID <{}> | USER <{}> | TOTAL AMOUNT <{}>", txnId, order.getUserId(), order.getTotalAmount());
    }

    private static void printOnExit(String txnId, Order order) {
        log.info("\n******************************");
        log.info("EXITING STREAM TXN WITH ID <{}> | USER <{}> | TOTAL AMOUNT <{}>", txnId, order.getUserId(), order.getTotalAmount());
    }
}
