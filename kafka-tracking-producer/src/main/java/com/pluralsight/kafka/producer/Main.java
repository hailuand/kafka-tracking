package com.pluralsight.kafka.producer;

import com.hailu.kafka.model.*;
import com.hailu.kafka.model.internal.EventGenerator;
import com.hailu.kafka.model.internal.model.Event;
import io.confluent.kafka.serializers.KafkaAvroSerializer;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.time.ZoneId;
import java.util.Properties;

@Slf4j
public class Main {
    private static final String TOPIC_NAME = "user-tracking-avro";

    public static void main(String[] args) throws InterruptedException {
        EventGenerator eg = new EventGenerator();
        Properties props = new Properties();
        props.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9093,localhost:9094");
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, KafkaAvroSerializer.class.getName());
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, KafkaAvroSerializer.class.getName());
        props.put("schema.registry.url", "http://localhost:8081");

        try (Producer<User, Product> producer = new KafkaProducer<>(props)) {
            for(int i = 0; i < 10; i++) {
              log.info("Generating event {}", i);
              Event event = eg.generateEvent();
              User key = getKey(event);
              Product value = getValue(event);
              ProducerRecord<User, Product> producerRecord = new ProducerRecord<>(TOPIC_NAME, key, value);
              log.info("Publishing record: {}", producerRecord);

              producer.send(producerRecord);
              Thread.sleep(1000L);
            }
        }
    }

    private static User getKey(Event e) {
        return User.newBuilder()
                .setUsername(e.user().username())
                .setUserId(e.user().userId().name())
                .setDateOfBirth(e.user().dateOfBirth().toInstant().atZone(ZoneId.systemDefault()).toLocalDate())
                .build();
    }

    private static Product getValue(Event e) {
        return Product.newBuilder()
                .setColor(Colors.valueOf(e.product().color().name()))
                .setDesignType(DesignType.valueOf(e.product().designType().name()))
                .setProductType(ProductType.valueOf(e.product().productType().name()))
                .build();
    }
}
