package com.java;

                                             //Using the sort() Method
import java.util.Arrays;

public class Sort_an_Array_54 {

	public static void main(String[] args) {
		
		int arr[]= {43,53,26,65,63,67,24,27};
		
		//invoking sort() method of the Arrays class
		
		Arrays.sort(arr);
		
        System.out.println("Elements of array sorted in ascending order:-");
        
        for(int i=0;i<arr.length;i++) {
        	
        	System.out.print(" "+arr[i]);
        }

	}

}
