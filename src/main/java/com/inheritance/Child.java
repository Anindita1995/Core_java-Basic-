package com.inheritance;


public class Child extends Father{

	public String myname = "Peu";
	
	public static void main(String[] args) {
		Child peu = new Child();
		System.out.println("Grand Father's name: "+ peu.grandpaname+" "+peu.LastName);
		System.out.println("Father's name: "+peu.papaname+" "+peu.LastName);
		System.out.println("My name: "+peu.myname+" "+peu.LastName);
		peu.address();
		System.out.println(peu.money);
	}
	

 
}
