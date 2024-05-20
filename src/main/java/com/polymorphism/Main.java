package com.polymorphism;

public class Main {
	public static void main(String[] args) {
		Car car = new Car();
		Bicycle bicycle = new Bicycle();
		Boat boat = new Boat();
		
    	Vehicle[] racer = {car,bicycle,boat};
		
//		car.speed();
//		bicycle.speed();
//		boat.speed();
		
		for(Vehicle v : racer) {
			v.speed();
		}
		
	}
	
	
}
