package com.Arrays;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,0,4,5};
//		int n = arr.length;
		
//		// 1st logic
//		int temp[] = new int[n];
//		
//		for(int i = 0 ; i < n ; i++) {
//			temp[i] = arr[n-i-1];
//		}
//		for(int i = 0 ; i < n ; i++) {
//			System.out.print(temp[i]+" ");
//		}
		reverse(arr);
		for(int i = 0 ; i < arr.length ; i++) {
			
			System.out.print(arr[i]+" ");
		}
	}
	public static void reverse(int arr[]) {
		int st = 0;
		int end = arr.length-1;
		
		while(st < end) {
			int temp = arr[st];
			arr[st] = arr[end];
			arr[end] = temp;
			st++;
			end--;
		}
	}
}
