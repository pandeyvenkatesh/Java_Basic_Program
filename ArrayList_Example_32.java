package com.Venkatesh;
import java.util.*;

public class ArrayList_Example_32 {

	public static void main(String[] args) {
		
		ArrayList<String> cars=new ArrayList();
		cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println("--------------------------");
	     for(int i=0;i<cars.size();i++) {   //for loop
	    	System.out.println(cars.get(i));
	    }
	    
	     System.out.println("--------------------------");

	    for(String  i: cars) {
	    	System.out.println(i);   //for each loop
	    	}
	    System.out.println("--------------------------");
	}

}
