package com.venkatesh;

class Student{
	int id;
	String name;
}

public class ObjectClass_Example_25 {

	public static void main(String[] args) {
		
		Student s1=new Student();
		Student s2=new Student();
	
		s1.id=22;
		s1.name="Venkatesh_Pandey";
		s2.id=29;
		s2.name="Harikesh_Pandey";
		
		System.out.println(s1.id+" "+s1.name);
		System.out.println(s2.id+" "+s2.name);
		
	}

}
