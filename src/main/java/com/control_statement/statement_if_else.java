package com.control_statement;

import java.util.Scanner;

public class statement_if_else {
public static void main(String[] args) {
//	int x = 1;
//	int y = 30;
	
	Scanner scanner = new Scanner(System.in);//to take input from user we are using scanner class. 
	System.out.println("Enter a value");
	int number = scanner.nextInt();
	if (number>0) {
		System.out.print("The number is positive");
	}else {
		System.out.print("The number is negative");
	}

}
}
