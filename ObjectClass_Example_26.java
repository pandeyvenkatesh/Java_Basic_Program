package com.venkatesh;

class Student2{
	int rollno;
	String name;
	
	void insertRecord(int r, String n) {
		rollno=r;
		name=n;
	}
	
	void displayInformation() {
		System.out.println(rollno+" "+name);
	}
}

public class ObjectClass_Example_26 {

	public static void main(String[] args) {
		

		Student2 s1=new Student2();
		Student2 s2=new Student2();
		
		s1.insertRecord(111,"Venkatesh");
		s2.insertRecord(222, "Harikesh");
	
		s1.displayInformation();
		s2.displayInformation();
	}
}
