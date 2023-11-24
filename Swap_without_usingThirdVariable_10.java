package com.venkatesh;
import java.util.*;

public class Swap_without_usingThirdVariable_10 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the value of A: ");
		int a=scn.nextInt();
		System.out.print("Enter the value of B: ");
		int b=scn.nextInt();
		
		System.out.println("Value of A and B Before swaping is A: "+a+" B: " +b);

		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Value of A and B After  swaping is A: "+a+" B: "+b);
	}

}
