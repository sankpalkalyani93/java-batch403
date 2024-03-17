package com.operators;

public class UnaryOperatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 10;
		int positiveNum = +num;
		int negativeNum = -num;
		System.out.println("Positive num : " + positiveNum);
		System.out.println("Negative num : " + negativeNum);
	
		boolean flag = true;
		boolean inverseOfFlag = !flag;
		System.out.println("Flag : " + flag + ", Inverse of Flag : " + inverseOfFlag);
		
		double value = 10.5;
		int intValue = (int)value;
		System.out.println("Value : " + value + ", int value : " + intValue);
		
		int count = 5;
		// Post increment 
		count++;
		System.out.println("Value of count++ : " + count);
		count--;
		System.out.println("Value of count-- : " + count);
	
		// pre increment 
		++count;
		System.out.println("Value of ++count : " + count);
		--count;
		System.out.println("Value of --count : " + count);
		
	}

}
