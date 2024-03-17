package com.operators;

public class LogicalOperatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 5, num2 = 4, num3 = 7;
		
		System.out.println(num1 + " > " + num2 + " && " + num1 + " > " + num3 + " = " + (num1 > num2 && num1 > num3));
		System.out.println(num1 + " > " + num2 + " || " + num1 + " > " + num3 + " = " + (num1 > num2 || num1 > num3));
		System.out.println("!(" + num1 + " > " + num2 + " && " + num1 + " > " + num3 + ") = " + (!(num1 > num2 && num1 > num3)));
	}

}
