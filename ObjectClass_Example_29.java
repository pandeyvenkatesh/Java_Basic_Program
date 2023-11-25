package com.java;

class Account{
	
	int acc_no;
	String name;
	float amount;
	
	//Method to initialize object
	
	void insert(int a, String n, float amt) {
	
		acc_no=a;
		name=n;
		amount=amt;
	}
	
	//deposit method
		
	void deposit(float amt) {
		
		amount =amount+amt;
		System.out.println(amt+ " deposited.");
	}
	
	void withdraw(float amt) {
		if(amount<amt) {
			System.out.println("Insufficient Balance");
			
		}else {
			amount=amount-amt;
			System.out.println(amt+" Withdrawn ");
		}
	}
	
	//method to check the balance of the account 
	void checkBalance() {
		System.out.println("Balance is:"+amount);
	}
	//method to display the values of an object 
	void display() {
		System.out.println(acc_no+" "+name+" "+amount);
	}
	
}

public class ObjectClass_Example_29 {

	public static void main(String[] args) {
		
     Account a1= new Account();
     
     a1.insert(13405,"Venkatesh Pandey",5000);
     a1.display();
     a1.checkBalance();
     a1.deposit(3000);
     a1.checkBalance();
     a1.withdraw(4000);
     a1.checkBalance();
	}

}
