package com.argument;

public class PassByValue {


	public static void main(String[] args) {
		//Primitive types are pass by value. 
		//When you pass a primitive type to a method, it is passed by value
		
		int a = 10;
		int b;
		System.out.println("A : "+a);
		//if 'a's value assign to 'b'
		b = a;
		System.out.println("B : "+b);
		b = 30;
		System.out.println("A : "+a);//a's value will remain unchanged
		System.out.println("B : "+b);
		
	}

}
