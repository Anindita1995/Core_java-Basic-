package com.conversion;

public class Casting {
public static void main(String[] args) {
	byte b;
	int i= 987;
	double d = 23.8907;
	
		
	System.out.println("Conversion of int to byte ");
	b = (byte)i;
	System.out.println(b);
	
	System.out.println("Conversion of double to int");
	i = (int)d;
	System.out.println("d= "+d+"\nAfter the conversion the 'd'became int = "+i);
System.out.println("------------------------Automatic Type Promotion in Expressions--------------------");
	double x = 17;
	double y = 3;
	
//	int x = 17;
//	int y = 3;
//	int z = x/y;
//	System.out.println(z);
	
	double a = (x/y);
	System.out.println(a);
	/*
	 * double a = (x / y);: Despite the fact that a is of type 
	double, the division is still performed as integer 
	division because both x and y are integers. After the 
	integer division is complete, the result is then cast 
	to a double. However, the fractional part is already 
	truncated at this point, so a ends up being 5.0 rather 
	than the expected 5.6667.
	*/
	
	
}

}
