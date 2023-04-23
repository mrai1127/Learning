package com.coding.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringSorter {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Alice");
		names.add("Dave");
		names.add("Charlie");
		names.add("Bob");
		
		System.out.println("Original list: " + names);
		
		Collections.sort(names, (a, b) -> a.compareTo(b));
		
		System.out.println("Sorted list: " + names);
	}

}
