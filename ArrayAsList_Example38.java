package com.Venkatesh;

import java.util.Arrays;
//Binary search

public class ArrayAsList_Example38 {

	public static void main(String[] args) {
		
    int arr[]= {12,53,6,7,84,75,36,9,4,2};
    
    Arrays.sort(arr);
    
    int intKey =84;
    
 // Print the key and corresponding index
	
    System.out.println(intKey+" found at index ="+Arrays.binarySearch(arr, intKey));
	}

}
