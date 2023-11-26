package com.Venkatesh;
import java.time.LocalDateTime; 
import java.time.format.DateTimeFormatter;
public class dateExample_36 {

	public static void main(String[] args) {
	
		LocalDateTime myDateobj=LocalDateTime.now();
		
		System.out.println("Before formatting "+myDateobj);
		
		DateTimeFormatter myFormatObj=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		String formattedDate = myDateobj.format(myFormatObj);
		
	    System.out.println("After formatting: " + formattedDate);
				

	}

}
