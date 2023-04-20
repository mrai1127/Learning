package com.coding.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaExample {
	
	public static void main(String[] args) {
		
		//create a list of integers
		List<Integer> numbers = new ArrayList<Integer>();
		for(int i = 1; i <= 10; i++) {
			numbers.add(i);
		}
		
		//print out the even numbers using a lmbda expression
		numbers.stream()
		.filter(n -> n % 2 == 0)
		.forEach(System.out::println);
	}

}
