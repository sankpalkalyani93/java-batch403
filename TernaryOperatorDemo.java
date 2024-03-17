package com.operators;

public class TernaryOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 7;
		String result = (x == 7) ? "Hello" : "Bye";
		System.out.println(result);
		
		int num = 56;
		result = (num % 5 == 0) ? num + " is divisible by 5" : num + " is not divisible by 5";
		System.out.println(result);
	
		boolean maritalStatus = true;
		result = (maritalStatus == true) ? "You Are Married." : "Unmarried";
		System.out.println(result);
		
	}

}
