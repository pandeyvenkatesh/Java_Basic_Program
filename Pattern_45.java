package com.Venkatesh;

/* WAP Print below Pattern
 
 5 4 3 2 1
 5 4 3 2 1 
 5 4 3 2 1 
 5 4 3 2 1 
 5 4 3 2 1

 */

public class Pattern_45 {

	public static void main(String[] args) {
		
		for(int i=5; i>=1;i--) {
			for(int j=5; j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
