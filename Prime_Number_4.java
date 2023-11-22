package com.java;
import java.util.*;
public class Prime_Number_4 {

	public static void main(String[] args) {
	
		System.out.print("Enter a number you want to check :- ");
		Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=0,v=0;
        m=n/2;
        
        if(n==0||n==1) {
        	System.out.println(n+" is not a Prime number.");
        }else {
        	for(int i=2;i<=m;i++) {
        		if(n%i==0) {
        			System.out.println(n+" is not a Prime number.");
        		v=1;
        		break;
        		}
        	}
        	if(v==0) {
        		System.out.println(n+" is a Prime number.");
        	}
        }
	}

}