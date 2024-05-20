package com.Interface;

public class Execution {

	public static void main(String[] args) {
//		Automobile auto = new Automobile(); we can not create object of an Interface
//		But we can create an object of a class 'KIA' and use the method from Automobile
		
		KIA kia = new KIA();
		kia.brakepad();//this brakepad is coming from KIA class
		kia.engine();
		kia.tire();
//		kia.accelerator();//outside class static method needs object to be called, but this is not a good practice
		KIA.accelerator();//Class can directly call static method & this accelerator() method is also from KIA class
		kia.window();
		
		Automobile automobile = new KIA();//this is the logic of writing
//      WebDriver driver = new ChromeDriver();		
		automobile.brakepad();//this brakepad is coming from Automobile Interface
		automobile.engine();// engine is coming from Automobile interface
		//to call the static methods from Automobile Interface
		Automobile.accelerator();//accelerator is a static so Interface can call itself. 
		
	
	}

	}


