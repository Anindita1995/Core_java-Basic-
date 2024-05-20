package com.constructor;

public class Student {
String student_name;//class level variable
int student_id;//class level variable
int age;//class level variable

	public static void main(String[] args) {
		
	//  Student st = new Student(); Compiler will execute Constructor the moment we create object,-called Default Constructor. 	
		Student st1 = new Student("Rahul", 1, 11);// as we define our own constructor, we can pass parameter 
		System.out.println(st1.student_name+" "+st1.result(70));
		
		Student st2 = new Student("Rohit", 2, 11);
		
		System.out.println("Name: "+st2.student_name+"\nID : "+st2.student_id+"\nMark: "+st2.result(59));
		System.out.println(st2.result(59));//inside sysout, First method will execute(pass/fail) then the value will print(59).
		//but if we call the  method without sysout then it will only execute the method(pass/fail).  
		//because of using Constructor we can reuse the global variable multiple times
		//if we create a customize constructor, then when we call the object, for each entity it will execute method. 
		//Like, here, Rahul&Rohit both are different entities, we create different object of the same class, 
		//and use the same method to achieve same goal. 
	}
	//we can not use the static variable inside the Constructor. 
public Student(String student_name, int id,int age) {//this is my user define parameterized constructor
	this.student_name = student_name;
	this.student_id = id;//this defines that "student_id" is belongs to Student class.
	this.age = age;
}

public int result(int m) {
	
	if(m>60) {
		System.out.println("pass");
	}else {
		System.out.println("fail");
	}
	return m;
}
}
