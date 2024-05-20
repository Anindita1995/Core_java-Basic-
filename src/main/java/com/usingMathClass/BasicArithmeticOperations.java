package com.usingMathClass;

public class BasicArithmeticOperations {
public static void main(String[] args) {
	int a = 2;
	int b = 3;
	int x = 10;
	int y = 20;
	double g = 6.79;
	double h = 5.09890;
	
	//Arithmetic Operation
	System.out.println(Math.addExact(x,y));//addition	
	System.out.println(Math.subtractExact(x, y));//subtraction
	//Exponential and Logarithmic Functions
	System.out.println(Math.pow(a, b));
	//Trigonometric Functions	
	System.out.println( Math.sin(x));
	//Minimum and Maximum:	
	System.out.println(Math.min(g, h));
	//constant value
	System.out.println(Math.PI);
	
}
}
