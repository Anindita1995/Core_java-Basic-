package com.inheritance;

public class Father extends Grandfather{//this relation is called HAS-A relationship
		
	public String papaname = "Tapos";
	
	public static void main(String[] args) {
		Father papa = new Father();
	System.out.println("Father's Name: "+papa.grandpaname+" "+papa.LastName);
	System.out.println("My Name: "+papa.papaname+" "+papa.LastName);
	papa.address();
	System.out.println("Assets from father: "+papa.money);
	
	}
	
}
