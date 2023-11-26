package com.Venkatesh;
import java.util.*;
//sort() method for sorting lists alphabetically or numerically:
public class ArrayList_Example_33 {

	public static void main(String[] args) {
	
		ArrayList<String> cars=new ArrayList();
		
		cars.add("Volvo"); //add the value with the help of add method
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");

	    Collections.sort(cars); //Sort cars
	    
	    for(String i :  cars) {
	    	System.out.println(i);
	    }
	}

}
