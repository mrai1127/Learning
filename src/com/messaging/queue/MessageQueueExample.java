package com.messaging.queue;

import java.sql.Connection;

public class MessageQueueExample {

	private static final String BROKER_URL = "tcp://localhost:61616";
	private static final String QUEUE_NAME = "test_Queue";

	public static void main(String[] args) {

		// create a connection to the message broker
		ConnectionFactory factory = new ActiveMQConnectionFactory(BROKER_URL);
		Connection connection = factory.createConnection();
		connection.start();

		// crate a session for sending and receicing messages
		Session session = connection.createSession(false, Session.AUTO_ACKNOWKEDGE);

		// create a queue to send and receive messages from
		Destination queue = session.createQueue(QUEUE_NAME);

		// create a producer to send messages to the queue
		MessageProducer producer = session.createProducer(queue);

		// send a message to the queue
		String messageText = "Hello, world!";
		TextMessage message = session.createTextMessage(messageText);
		producer.send(message);
		System.out.println("Sent message: " + messageText);

		// create a consumer to recieve messages form the queue
		MessageConsumer consumer = session.createConsumer(queue);

		// wait for a message to be received
		Message recievedMessage = consumer.recieve();
		if (recievedMessage instanceof TextMessage) {
			String recievedMessageText = ((TextMessage) recievedMessage).getText();
			System.out.println("Received message: " + receivedMessageText);
		}

		// clean up resources
		consumer.close();
		producer.close();
		session.close();
		connection.close();

	}

}
