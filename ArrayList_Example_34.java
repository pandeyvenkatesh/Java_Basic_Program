package com.Venkatesh;
import java.util.*;
public class ArrayList_Example_34 {

	public static void main(String[] args) {
		
		ArrayList<Integer> mynum=new ArrayList<	Integer>();
		
		mynum.add(43);
		mynum.add(45);
		mynum.add(21);
		mynum.add(10);
		mynum.add(66);
		mynum.add(52);
		mynum.add(32);
		
		Collections.sort(mynum);// Sort mynum
		
		for(int i : mynum)
		{
		System.out.println(i);

	}
	}
}
