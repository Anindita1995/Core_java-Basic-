package com.keyword_final;

public class Final_keyword {
	/*
	 * final keyword
	 * Final is a reserved keyword to apply restrictions on variables, methods or classes. 
	 * Which ensures that the declared entity can not be changed
	 * 
	 * **********/
	
	
	final int x = 10;
	
	
	void example1(int a) {
		//this.x = a; 	// this line will through an error, as we already initialized int x as a final
						// so further we can not assign new value on it. 
	}
						//final with variable: the value of a variable can not be changed once it 
						//initialized with final keyword	
	
	public final void final_method() {// this method can not be overridden by subclass. 
		// for example look SUBCLASS_OF_FINAL_CLASS.class file. 
		System.out.println("I am finale method");
	}
	public static void main(String[] args) {
		//or
		int y = 30;
		y = 100;	       // compiler allows to change the value of 'y'
		final int z = 30;
		//z = 20;		       // compiler will through an error, as we declare as a final variable.

	}

}
