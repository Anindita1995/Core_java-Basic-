package com.control_statement;

public class Decrement {
public static void main(String[] args) {
	System.out.println("-------POST DECREMENT--------");
	int a = 20;//a=19
	int b = a--;//b=20
	System.out.println("Value of a: "+a);//a(19)** after post decrement
										//After post decrement of b, a loses the value
	System.out.println("Value of b: "+b);//b(20)** before post decrement b=a(20)
	System.out.println();
	int c = b--;
	System.out.println("Value of a: "+a);//19
	System.out.println("Value of b: "+b);//19
	System.out.println("Value of c: "+c);//20
	
	System.out.println();
	System.out.println("-------PRE DECREMENT--------");
	int x = 20;
	int y = --x;
	System.out.println("Value of x: "+x);//19
	System.out.println("Value of y: "+y);//19
	System.out.println();
	int z = --y;
	System.out.println("Value of x: "+x);//19
	System.out.println("Value of y: "+y);//18
	System.out.println("Value of y: "+z);//18
	
}
}
