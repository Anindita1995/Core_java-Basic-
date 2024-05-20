package com.constructor;
/*
 * 
 * The main purpose of using Constructor is to initialize the object of the class. 
 * Constructor is a block, but it is not a method. 
 * Constructor can not have return type, not even void. 
 * Java creates by default constructor, at the moment we create object of the class. 
 * Java supports both default-constructor and user-define constructor. 
 * */



public class EmployeeData {
	
	String employee_name;// without constructor the default value will be 'NULL'
	int emp_salary; //instance variable
					//without constructor the default value will be '0'
	
	public EmployeeData(String name,int salary) {//parameterized constructor
		this.employee_name = name;
		this.emp_salary = salary;// setting initial value for employee_name and emp_salary
		
	}
	/*
	 * *****This Keyword******
	 * This is a reference variable which refers to the current object. 
	 * for more details visit 'This_keyword.class' file. 
	 * 
	 * 
	 * */
	public String get_empName() {//using getter method
		return employee_name;
	}
	public int get_empSal() {
		return emp_salary;//using getter method
	}

	public static void main(String[] args) {
		EmployeeData emp1 = new EmployeeData("Salman", 25000);
		EmployeeData emp2 = new EmployeeData("Aman", 50000);
		EmployeeData emp3 = new EmployeeData("Tania", 40000);
		EmployeeData emp4 = new EmployeeData("John", 35000);
		

		System.out.println("Employee details: 1. "+"\nName: " +emp1.get_empName()+" \nSalary: "+emp1.get_empSal());
		System.out.println("Employee details: 2. "+"\nName: " +emp2.get_empName()+" \nSalary: "+emp2.get_empSal());
		System.out.println("Employee details: 3. "+"\nName: " +emp3.get_empName()+" \nSalary: "+emp3.get_empSal());
		System.out.println("Employee details: 4. "+"\nName: " +emp4.get_empName()+" \nSalary: "+emp4.get_empSal());
		
		
	}

}
