package com.Interface;
//how to implements interface into the class ?
public class KIA implements Automobile{
	//this is called IS-A relationship

	public static void main(String[] args) {
		accelerator();
		KIA k = new KIA();
		k.brakepad();
		k.engine();
		k.tire();
		k.window();

	}
//Automatically class will inherits all the methods from the interface.  
	@Override
	public void tire() {
		System.out.println("KIA tire");
		
	}

	@Override
	public void engine() {
		System.out.println("KIA engine");
		
	}

	@Override
	public void brakepad() {
		System.out.println("KIA breakpad");
		
	}
//But static and default method can not be inherited automatically
public static void accelerator() {// this is not from Automobile Interface
	System.out.println("I am accelaretor from KIA");
	}
}
