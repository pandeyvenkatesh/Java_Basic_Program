package com.Venkatesh;
/*
 WAP Print Below Pattern
  
 1  3  5  7  9
 11 13 15 17 19
 21 23 25 27 29
 31 33 35 37 39
 41 43 45 47 49
  
 */

public class Pattern_47 {

	public static void main(String[] args) {
		
	int k=1;
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{
			System.out.print(k+" ");
			k=k+2;
		} 
		System.out.println();
	}

	}

}
