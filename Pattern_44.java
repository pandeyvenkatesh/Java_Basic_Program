package com.Venkatesh;

/* WAP to Print below pattern
 
 5 5 5 5 5
 4 4 4 4 4
 3 3 3 3 3
 2 2 2 2 2 
 1 1 1 1 1 
 
 */

public class Pattern_44 {

	public static void main(String[] args) {
		
		for(int i=5;i>=1;i--) {
			
			for(int j=5;j>=1;j--) {
				
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
