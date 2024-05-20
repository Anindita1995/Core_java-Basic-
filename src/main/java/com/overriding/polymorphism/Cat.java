package com.overriding.polymorphism;

public class Cat extends Animal {
	@Override
public void speak() {
	System.out.println("Cat can not speak");
}
}
