package com.objectofclass;

public class Vehicle {
	String name;
public String Car(String n) {
	
	System.out.println("I am "+n);
	return n;
}
public void bicycle() {
	System.out.println("I am bicycle");
}
public static void main(String[] args) {
	Vehicle v = new Vehicle();
	v.Car("Honda");
	v.bicycle();
}
}
