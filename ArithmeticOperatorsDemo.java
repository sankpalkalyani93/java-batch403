package com.operators;

public class ArithmeticOperatorsDemo {

	public static void main(String[] args) {
		int num1 = 10, num2 = 10;
		int result = 0;
		
		result = num1 + num2;
		System.out.println("Addition : " + result);	// 20
		
		result = num1 - num2;
		System.out.println("Subtraction : " + result);	// 0
		
		result = num1 * num2;
		System.out.println("Multiplication : " + result);	// 100
		
		result = num1 / num2;
		System.out.println("Division : " + result);	// 1
		
		result = num1 % num2;
		System.out.println("Modulus : " + result);	// 0
	}

}
