package com.kafka.streams.producer;

import com.hailu.kafka.model.Order;
import com.hailu.kafka.model.User;
import com.hailu.kafka.model.UserId;
import com.hailu.kafka.model.internal.EventGenerator;
import com.hailu.kafka.model.internal.model.Event;
import com.kafka.streams.FraudDetectionApp;
import io.confluent.kafka.serializers.KafkaAvroSerializer;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.time.ZoneId;
import java.util.Properties;
import java.util.stream.IntStream;

@Slf4j
public class PaymentProducer {
    public static void main(String[] args) {
        Properties props = new Properties();
        props.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9093,localhost:9094");
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, KafkaAvroSerializer.class.getName());
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, KafkaAvroSerializer.class.getName());
        props.put("schema.registry.url", "http://localhost:8081");

        try(Producer<User, Order> producer = new KafkaProducer<>(props)) {
            EventGenerator eg = new EventGenerator();
            IntStream.range(0, 10).forEach(i -> {
                log.info("Generating order event {}", i);
                Event event = eg.generateEvent();
                User user = User.newBuilder()
                        .setUsername(event.user().username())
                        .setUserId(event.user().userId().name())
                        .setDateOfBirth(event.user().dateOfBirth().toInstant().atZone(ZoneId.systemDefault()).toLocalDate())
                        .build();
                Order order = Order.newBuilder()
                        .setUserId(UserId.valueOf(event.order().userId().name()))
                        .setNbOfItems(event.order().nbOfItems())
                        .setTotalAmount(event.order().totalAmount())
                        .build();
                ProducerRecord<User, Order> producerRecord = new ProducerRecord<>(FraudDetectionApp.PAYMENTS_TOPIC, user, order);
                log.info("Publishing record {}", producerRecord);
                producer.send(producerRecord);

                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }
    }
}
