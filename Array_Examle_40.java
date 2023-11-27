package com.venkatesh;
import java.util.*;
//Taking input from user 

public class Array_Examle_40 {

	public static void main(String[] args) {
		
		int arr[]=new int[5];
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter element of the array - ");
		
		for(int i=0;i<5;i++) {
			System.out.println("Enter value for arr["+i+"] -");
			arr[i]=scn.nextInt();
			
		}
		System.out.println("Content of the array -");
		
		for(int i=0;i<5;i++) {
			System.out.println("Value at arr["+i+"]is "+arr[i]);
		}

	}

}
