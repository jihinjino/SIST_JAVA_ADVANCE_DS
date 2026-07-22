package com.Basics;

public class IncrementDecrement {

	public static void main(String[] args) {
		
		int a = 7;
		a = ++a + a-- * (a*2) * a++;
		
//		System.out.println(++a);//6
//		System.out.println(a++);//6
//		System.out.println(a);//7
//		a = 10;
//		a  = ++a + a-- + a + a++ ; // 10
//		int b = 7;
		System.out.println(a);
	}

}
