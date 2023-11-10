package com.venkatesh;
//How to Take Input From User in Java
//Using Scanner Class for Taking Input in Java
import java.util.*;
public class inputOutput {

	public static void main(String[] args) {
		
		 // Scanner definition
		Scanner scn=new Scanner(System.in);
		
	    // input is String 	(one word)
		//read by the next() function 
		
		String str1 =scn.next();
		
		// print string 
		
        System.out.println("Entered the String str1 : "+str1);
        
        //input is String (Complete sentence)
        // read by the nextLine()function 
        
        String str2 = scn.nextLine();
        //print string
        
        System.out.println("Entered the string str2 : "+ str2);
        
        //Input in an Integer 
        //read by the nextInt()function
        
        int x=scn.nextInt();
        
        //print integer 
        
        System.out.println("Entered Integer : "+ x);
        
        //input a floating Value 		
        // read by the nextFloat();
        float f=scn.nextFloat();
        
        System.out.println("Entered Floatvalue : "+f);
	}

}
