package com.Functions;

public class WithoutReturnTypeWithParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1234;
		int n1 = 4356;
		reverse(n);// actual parameters
		reverse(n1);
		reverse(1290);
		add(10,20);
		
	}
	public static void reverse(int n) // formal parameters
	{
		int rev = 0;
		while( n != 0) {
			rev = rev  * 10 + n % 10;
			n /= 10;
		}
		System.out.println(rev);
	}
	public static void add(int a , int b) {
		System.out.println(a+b);
	}

}
