package com.apache.kafka;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

public class KafkaProducerExample {
	
	public static void main(String[] args) {
		String topicName = "my-topic";
		String key = "key1";
		String value = "Hello, World!";
		
		//set the properties
		Properties props = new Properties();
		props.put("bootstrp.servers", "localhost:9092");
		props.put("Key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		props.put("Value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		
		//create a producer
		Producer<String, String> producer = new KafkaProducer<>(props);
		
		//create a record to be sent
		ProducerRecord<String, String> record = new ProducerRecord<>(topicName, key, value);
		
		//send the record
		producer.send(record);
		
		System.out.println("Sent message: " + record);
		
		//close the producer
		producer.close();
	}
}
