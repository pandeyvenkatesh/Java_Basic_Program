package com.java;

//method to display the value of id and name 
//which displays the default values  
class Student2{
	int id;
	String name;
	
	//method to display the value of id and name 
	void display() {
		System.out.println(id+" "+name);
	}
}

public class OOPS_Example_31 {

	public static void main(String[] args) {
		
		Student2 s1=new Student2();
		Student2 s2=new Student2();
		
		//Displaying  value of the object 
		s1.display();
		s2.display();

	}

}
