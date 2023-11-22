package com.venkatesh;
import java.util.*;
public class fibonacci_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter a number you want to check :- ");
		int count=scn.nextInt();
		int n1=0, n2=1,n3, i;
		
		System.out.print(n1+" "+n2);
		
		for(i=2;i<count;i++) {
			
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}

	}

}
