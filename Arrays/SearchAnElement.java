package com.Arrays;

public class SearchAnElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,3,3,3,47,8,9,0,3};
		int target = 3;
//		int ind = LinearSearch(arr, target);
		int index = binarySearchDuplicate(arr,target);
		System.out.println(index);
		
	}
	public static int binarySearchDuplicate(int arr[] , int target) {
		int left = 0; 
		int right = arr.length - 1;
		int ind = -1;
		while(left <= right) {
			int mid = (left + right) / 2;
			if(arr[mid] == target) {
				ind = mid;
				right = mid - 1;
			}
			if(arr[mid] < target) left = mid + 1;
			if(arr[mid] > target) right = mid - 1;
		}
		return ind;
		
	}
	public static int binarySearch(int arr[] , int target) {
		int left = 0;
		int right = arr.length - 1;
		while( left <= right ) {
			int mid = (left + right) / 2;
			if(arr[mid] == target) return mid;
			if(arr[mid] < target) left = mid + 1;
			if(arr[mid] > target) right = mid - 1;
			}
		return -1;
	}
	public static int LinearSearch(int arr[] , int target) {
		int ind = -1;
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] == target) ind = i;
		}
		return ind;
	}

}
