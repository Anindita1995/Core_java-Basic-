package com.Abstraction;

public class Object_of_AbstractClass extends Abstract_SuperClass {
	/*We can not directly create an object of an Abstract class. 
	 *Because Abstract class meant to be extended by other class and 
	 *can not instantiated on their own
	 *
	 *But if the Abstract class has concrete subclass then we can create object into the
	 *subclass.  */
	
	
	
	@Override
	void method_for_create_Objects() {
		System.out.println("This method is from Abstract_SuperClass");
	}
	public static void main(String[] args) {
		
		Abstract_SuperClass print_method = new Object_of_AbstractClass();//Create an object of a subclass
		print_method.method_for_create_Objects();
		
		
	}

}
