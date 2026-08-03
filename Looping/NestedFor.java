package com.Looping;


public class NestedFor {

	public static void main(String[] args) {
		
		/*
		int n = 7;
		for(int row = 1 ; row <= n ; row++) {
			for(int col = 1 ; col <= row ; col++) {
				if(col == 1 || col == row)
					System.out.print("1 ");
				else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
		*/
		
		/*
		int n = 5;
		int odd = 1;
		int even = 2;
		for(int row = 1 ; row <= n ; row++) {
			for(int col = 1 ; col <= row ; col++) {
				if(row % 2 == 0) {
					System.out.print(even+" ");
					even += 2;
				}
				else {
					System.out.print(odd+" ");
					odd += 2;
				}
			}
			System.out.println();
		}
		*/
		
		int n = 7 ;
		for(int row = 1 ; row <= n ; row++) {
			for(int col = 1 ; col <= n ; col++) {
				if(row == 1 || col == 1 || row == n || col == n || (row == (n+1)/2 && col == (n+1)/2)) {
					System.out.print("1 ");
				}
				else System.out.print("0 ");
			}
			System.out.println();
		}
	}

}
