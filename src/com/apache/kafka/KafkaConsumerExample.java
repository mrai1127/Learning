package com.apache.kafka;

import java.util.Collections;
import java.util.Properties;
import java.util.function.Consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

public class KafkaConsumerExample {
	
	public static void main(String[] args) {
        String topicName = "my-topic";

        // set the properties
        Properties props = new Properties();
        props.put("bootstrap.servers", "localhost:9092");
        props.put("key.deserializer", StringDeserializer.class.getName());
        props.put("value.deserializer", StringDeserializer.class.getName());
        props.put("group.id", "my-group");

        // create a consumer
        Consumer<String, String> consumer = new KafkaConsumer<>(props);

        // subscribe to the topic
        consumer.subscribe(Collections.singleton(topicName));

        // poll for new messages
        while (true) {
            ConsumerRecords<String, String> records = consumer.poll(100);

            for (ConsumerRecord<String, String> record : records) {
                System.out.printf("Received message: key=%s value=%s%n", record.key(), record.value());
            }
        }
    }

}
