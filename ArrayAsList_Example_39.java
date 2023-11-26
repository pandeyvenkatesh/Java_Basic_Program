package com.Venkatesh;
import java.util.Arrays;

public class ArrayAsList_Example_39 {

	public static void main(String[] args) {
		
		int arr[]= {12,53,5,64,67,86,2,46,37};
		
        Arrays.sort(arr);
        
        int k=64;
        
        System.out.println(k+" Found at index = "+Arrays.binarySearch(arr,1,3,k));

	}

}
