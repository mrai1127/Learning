package com.coding.lambda;

import java.util.function.BinaryOperator;

public class Calculator {
	public static void main(String[] args) {
		BinaryOperator<Integer> add = (a, b) -> a + b;
		BinaryOperator<Integer> subtract = (a, b) -> a - b;
		BinaryOperator<Integer> multiply = (a, b) -> a * b;
		BinaryOperator<Integer> divide = (a, b) -> a / b;
		
		System.out.println("3 + 2 = " + add.apply(3, 2));
		System.out.println("3 - 2 = " + subtract.apply(3, 2));
		System.out.println("3 * 2 = " + multiply.apply(3, 2));
		System.out.println("3 / 2 = " + divide.apply(3, 2));
	}

}
