package com.static_nonstatic;
/*
 * Static is keyword
 * It is associated with the members of the class. 
 * Static can call each other with out create any object of a class. 
 * static can call the class itself without creating object. 
 * Non-static can call static with out creating object
 * static can not call non static directly, class object need to be created to call non static. 
 * */
public class Static_nonStatic {
	
public static void main(String[] args) {
		
		
		method_1();// static method directly can be called in main method 
		           //as main method is also static.
	
		System.out.println(" ");
		Static_nonStatic obj = new Static_nonStatic();
		obj.method_2();// to call non static, need to create object. 
		System.out.println(" ");
		method_3();

	}
static void method_1() {
	System.out.println("****Method_1********");
	System.out.println("Static: ");
	System.out.println("I am calling my class itself and also myself");
	//Static_nonStatic.method_1();//this is also causing StatckOverflowError.
	System.out.println("Then I fucked up");
}
void method_2() {
	System.out.println("****Method_2********");
	System.out.println("Non Static: ");
	System.out.println("Method 3 is calling from Method 2");
	method_3();
}
static void method_3() {//can not write 'void static'
	System.out.println("****Method_3********");
	System.out.println("Static: ");
//	Static_nonStatic obj = new Static_nonStatic();
//	System.out.println("Method 2 is called from Method 3");
//	obj.method_2();//a static method can call non static after creating object. 
	
}

	static void method_for_main_method() {//this is a static method.
		System.out.println("I am static method_1 trying to call main method");
		Static_nonStatic obj_1 = new Static_nonStatic();
		String[]arg = {"ABC","DEF"};
		obj_1.main(arg);// this is called  recursively calling main method which is not recommended 
////   This execution leads in to the StackOverflowError. 
	}
	
	
	
	

}
