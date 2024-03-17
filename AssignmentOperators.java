package com.operators;

public class AssignmentOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = 100;
		System.out.println("Value of result : " + result);	// 100
		
		//result = result + 10;
		result += 10;
		System.out.println("Value of result after += : " + result); // 110
	 	
		result -= 5;
		System.out.println("Value of result after -= : " + result); // 105
		
		result *= 3;
		System.out.println("Value of result after *= : " + result); // 315
		
		result %= 2;
		System.out.println("Value of result after %= : " + result); // 1
		
		result /= 5;
		System.out.println("Value of result after /= : " + result); // 0
	}

}
