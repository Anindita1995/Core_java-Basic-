package com.keyword_final;

public class SubClass_of_Final_Class extends Final_keyword{
	//public class SubClass_of_Final_Class extends Final_as_class{
	//this class can not  be extend as it is a Final class.so compiler will through an error.  

	public void example1(int x) {//example1 method is not final, so compiler allows to override this method.
		
	}
	
//	public void final_method() { //As final_method is a final in Parent class so
//		//this method can not be overridden. 
//		System.out.println("Trying to override method");
//	}
//	
	public static void main(String[] args) {
	SubClass_of_Final_Class obj_subclass = new SubClass_of_Final_Class();
	obj_subclass.example1(10); 
	obj_subclass.final_method();

	}

}
