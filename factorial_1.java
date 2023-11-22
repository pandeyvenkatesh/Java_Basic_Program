package com.venkatesh;
import java.util.*;
public class factorial_1 {

	public static void main(String[] args) {
	  
		 Scanner scn=new Scanner(System.in);
		 System.out.print("Enter a Number you want to Check Factorial :- ");
		 
		 int n=scn.nextInt();
   		
		int i,fact=1; 

		for(i=1;i<=n;i++) {
			fact=fact*i;
			
		}
		
		System.out.println("Factorial of "+n+" is "+fact);
	}

}
