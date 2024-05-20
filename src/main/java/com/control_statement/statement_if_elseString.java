package com.control_statement;

public class statement_if_elseString {

	public static void main(String[] args) {
		int x1 = 10;
		String x= "Hello";
		String y = "Java";
		if(x==y) {
			System.out.println("The value of both strings are equal");
		}else {
			System.out.println("Value of the both Strings are not equal");
		}
		String z = "I am coding in JAVA";
		String z1 = "I am coding in Python";
		if(z.equals(z1)) {
			System.out.println("Both can not learn at the same time");
		}else {
			System.out.println("Go Understanding ");
		}
	if(z.equals(x1)) {//inside the equals() non primitive datatype can also be checked
		System.out.println("Go Understanding ");
	}
	else {
		System.out.println("Go Understanding X1 ");
	}
	}

}
