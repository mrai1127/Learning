package com.coding.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerFilter {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(5);
		numbers.add(3);
		numbers.add(8);
		numbers.add(6);
		numbers.add(7);
		numbers.add(2);
		
		System.out.println("Original list: " + numbers);
		
		List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0)
				.collect(Collectors.toList());
		
		System.out.println("Even numbers: " + evenNumbers);
	}

}
