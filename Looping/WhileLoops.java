package com.Looping;

import java.util.Scanner;

public class WhileLoops {

	public static void main(String[] args) {
		
		int password = 12345;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the password");
		int pass = sc.nextInt();
		while(password != pass) {
			System.out.println("Enter the valid password");
			pass = sc.nextInt();
		}
		System.out.println("Access Granted");
	}
}
