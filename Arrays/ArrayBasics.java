package com.Arrays;

import java.util.Scanner;

public class ArrayBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] = {1,2,3,4,5,6,6,7,8,9,-1,0,-5}; 
//		System.out.println(arr[7]);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = sc.nextInt();
		}

		int sum = 0;
		for(int i = 0 ; i < arr.length ; i++) {//Traversal
			sum = sum + arr[i];
		}
		System.out.println(sum);
//		System.out.println();
//		for(int i = arr.length -1 ; i >= 0 ; i-- ) {
//			System.out.print(arr[i]+" ");
//		}
		
	}

}
