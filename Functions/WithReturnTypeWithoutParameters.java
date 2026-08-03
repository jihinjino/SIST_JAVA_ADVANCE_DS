package com.Functions;

public class WithReturnTypeWithoutParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int n = 7;
//		int fib = fibinocci(n);
//		System.out.println(fib);
		int x = 123421;
		int rev = reverse(x);
		boolean ans = checkPalin(x,rev);
		System.out.println(ans);
	}
	public static int reverse(int n) {
			
		int rev = 0;
		while(n != 0) {
			rev = rev * 10 + n % 10;
			n /= 10;
		}
		return rev;
	}
	public static boolean checkPalin(int n , int rev) {
//		return n == rev ;
		if( n == rev) return true;
		else return false;
	}
	
	public static int fibinocci(int x) {
		
		int first = 0; // 0th fib
		int second = 1; // 1st fib
		
		for(int i = 2 ; i <= x ; i++) {
			int third = first + second;
			first = second;
			second = third;
		}
		
		return second;
	}
	
	

}
