package com.Interface;

public interface Automobile {// this is an Interface
	/*
		1. Interface is  pure Abstraction
		2. Collection of abstract methods
		3. Interface can not instantiate object. 
		4. It can only implemented by a class. The class will inherits all 
		the methods of the Interface.
		5. Any variable once initialize or declared in interface is a final in nature,
		also the static variable.(by default static)
		6. Can we make object of an Interface? Answer: No, because Interface is pure abstraction, it will not allow to 
		instantiate object. 

*/	
/*public void streeting() {
 * 
 * }//throw an error as abstract method can not have body*/
	
	//Abstract method can not have body
	//And also abstract method can not be static as well. 
	//because if it is static then the method should have the body
	public void tire();
	public void engine();
	public void brakepad();
	
	//Only default and static method can have body
	public static void accelerator() {
		System.out.println("I am accelaretor from Automation Interface");
	}
	public default void window() {
		System.out.println("I am window from Automation Interface");
	}
	
	//Interface can have main method. 
	public static void main(String[] arg) {//main method allowed
		
	} 

}
