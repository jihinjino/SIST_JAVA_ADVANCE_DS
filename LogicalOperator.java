package com.Basics;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		/*
		 * LOGICAL AND -- > &&
		 * LOGICAL OR  -- > ||
		 * LOGICAL NOT -- > !
		 */
		System.out.println((a+b)%2 != 0 || (a % b != 0 && a + b > 10));
		System.out.println(!(a/b > 0));// not operator
	}

}
