package com.control_statement;

public class statement_nested_if {
	public static void main(String[] args) {
		String weather = "sunny";
		String temp = "too hot";

		if (weather=="sunny") {
			if (temp=="less hot") {
				System.out.println("Stay at home");
			}else {System.out.println("Let's go outside");}
		}
	}

}
