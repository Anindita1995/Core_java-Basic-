package com.overriding.polymorphism;

public class Dog extends Animal {

	@Override
	public void speak() {
		System.out.println("Dog can bark");
	}
}
