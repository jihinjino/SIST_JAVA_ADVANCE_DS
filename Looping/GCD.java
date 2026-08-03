package com.Looping;

public class GCD {
	public static void main(String[] args) {
		int b = 48;
		int a = 18;
		
		while(b != 0) {
			int temp = b ;
			b = a % b;
			a = temp;
		}
		System.out.println(a);
	}
}
