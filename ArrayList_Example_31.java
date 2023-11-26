package com.Venkatesh;
import java.util.ArrayList;

public class ArrayList_Example_31 {

	public static void main(String[] args) {
		
		ArrayList<String> cars =new ArrayList<String>();
		cars.add("Volvo"); // The ArrayList class has many useful methods.Add elements to the ArrayList, use the add() method:
		cars.add("Swift");
        cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		
		cars.set(0, "Nano"); // Use in ArrayList for change an Item
		
		cars.remove(4); //To remove an element, use the remove() method and refer to the index number:
        
	//	cars.clear(); //To remove all the elements in the ArrayList, use the clear() method:
		
		System.out.println(cars.size()); //To find out how many elements an ArrayList have, use the size method:
		
		System.out.println(cars); //Print full in arrayList 
		
		System.out.println(cars.get(1));  //To access the element in the ArrayList, use get() method and refer to the index Number. 
	}

}

