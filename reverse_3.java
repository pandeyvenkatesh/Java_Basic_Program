package com.venkatesh;
import java.util.*;
//using while 
public class reverse_3 {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		
		System.out.print("Enter number you want to reverse:- ");
		int number=scn.nextInt();
		
      int reverse =0;
      
      while(number !=0) {
    	  
    	  int reminder=number %10;
    	  reverse=reverse*10+ reminder;
    	  number=number/10;
    	}
      System.out.println("The Reverse of given number is :- "+reverse);
	}

}
