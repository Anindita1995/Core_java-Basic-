package com.inheritance;
/*
 * 
 * 'super' keyword is a reference type of variable, which refers to the object of the parent class
 * though it is related to the Parent class, means it is related to INHERITANCE concept. 
 * 

 * assume that Super_keyword class is our child class. So
 * we will extends a Parent class.
 * 
 * */
public class Super_keyword extends Parent{ 
	String x = "Child";
	
	void print_without_keyword() {
		System.out.println("Value without keyword ");
		System.out.println(x);
	}
	void print_with_this_keyword(String identity) {
		System.out.println("Value using This keyword ");
		
		System.out.println(this.x);// it will print the value from instance variable
		System.out.println(identity);// this will print the value, which assign through the parameter. 
	}
	void print_with_using_super_keyword(String identity) {
		System.out.println(identity);
		
		System.out.println("Value using Super keyword ");
		System.out.println(super.x);//it will the print the value from the Parent Class
	}
	public static void main(String[] args) {
		Super_keyword obj = new Super_keyword();
		
		obj.print_without_keyword();//Output: Child
		
		obj.print_with_this_keyword("I am from Child");//Output: Child
													   //I am from Child
		
		obj.print_with_using_super_keyword("Data from parent class");//Output: Data from parent class
																	 //Parent
		

	}

}
