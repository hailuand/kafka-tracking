import com.hailu.kafka.model.Product;
import com.hailu.kafka.model.User;
import io.confluent.kafka.serializers.KafkaAvroDeserializer;
import io.confluent.kafka.serializers.KafkaAvroSerializer;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.consumer.ConsumerConfig;

import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

import java.time.Duration;
import java.util.List;
import java.util.Properties;

@Slf4j
public class Main {
    private static final String TOPIC_NAME = "user-tracking-avro";

    public static void main(String[] args) {
        Properties props = new Properties();
        props.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9093,localhost:9094");
        props.put("group.id", "user-tracking-consumer");
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, KafkaAvroDeserializer.class.getName());
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, KafkaAvroDeserializer.class.getName());
        props.put("specific.avro.reader", "true");
        props.put("schema.registry.url", "http://localhost:8081");

        try (KafkaConsumer<User, Product> consumer = new KafkaConsumer<>(props)) {
            consumer.subscribe(List.of(TOPIC_NAME));

            while(true) {
                ConsumerRecords<User, Product> records = consumer.poll(Duration.ofMillis(100));
                records.forEach(cr -> {
                    log.info("Check it out! I gotcha! {}", cr);
                });
            }
        }
    }
}
