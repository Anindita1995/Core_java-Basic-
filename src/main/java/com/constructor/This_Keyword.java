package com.constructor;

public class This_Keyword {

	String emp_name;//default value of String = NULL
	int emp_salary;// Default value of int = 0
	
	public void emp_details_without_this_keyword(String name, int salary) {//we can also create constructor instead of creating method
		
	}
	
	
	public void emp_details_using_this_keyword(String name, int salary) {
		this.emp_name = name;
		this.emp_salary = salary;
	}
	
	
	public void get_details() {
		System.out.println(emp_name);//pass the instance variable emp_name
		System.out.println(emp_salary);//pass the instance variable emp_salary
	}
	
	public static void main(String[] args) {
		This_Keyword obj = new This_Keyword();
		System.out.println("*******Output without 'this' keyword*******");
		obj.emp_details_without_this_keyword("Salman", 2500);
		obj.get_details();// Output will be the default value, Null & 0.
		System.out.println("*******Output after using 'this' keyword*******");
		obj.emp_details_using_this_keyword("Salman F Rahaman", 45000);
		obj.get_details();// Output will be the value which is assigned
		

	}

}
