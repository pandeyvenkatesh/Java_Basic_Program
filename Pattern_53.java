package com.venkatesh;

/*
  5 4 3 2 *
  5 4 3 * 1
  5 4 * 2 1
  5 * 3 2 1
  * 4 3 2 1
 
  */

public class Pattern_53 {

	public static void main(String[] args) {
		
		int x=5;
	
		for(int i=1;i<=x;i++) {
			for(int j=x;j>=1;j--) {
				
				if(j!=i)
					System.out.print(j+" ");
			else 
				System.out.print(" * ");
			}
			System.out.println();
		}

	}

}
