package com.apache.kafka;

import java.util.Scanner;

public class KafkaOne {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = scanner.nextLine();
		
		for(int i = 0 ; i < 5; i++) {
			System.out.println(name);
		}
	
}
}
