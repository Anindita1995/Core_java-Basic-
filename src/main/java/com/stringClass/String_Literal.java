package com.stringClass;



public class String_Literal {

	public static void main(String[] args) {
		String s = new String();
		//when we create an object of a String class 's', that stores into the heap memory. 
		//we have 5 memories. 
		/*1. Method Area.
		 * 2. Stack Memory
		 * 3. Heap Memory
		 * 4. PC register
		 * 5. Native Method Area. */
		String S1 = new String("String Literal 1");// This is String Literal. This S1 will store twice.
		//One inside the heap memory, another one inside SCP/SLP memory which is also inside the heap memory. Look at the diagram in NOTE. 
		// The object inside the SCP/SLP memory is referred by JVM internal reference. 
		//Garbage collection can delete the String Literal Pool object inside the heap memory but not from the SCP memory. 
		//This stores memory twice which is not optimum way to use memory space. So this not recommended. 
		String S2 = "String Literal 2";// This approach creates only one object, so this is very optimized about memory, this is recommended
		String S3 = new String("Tania");//This will create 2 objects for heap and SCP memory. 
		String S4 = new String("Tania");// Here there value inside the String is same, so it will only create one object for heap memory
		// and inside the SCP memory JVM will refer the same object.
		String S5 = new String("Tania");// S5 will do the same as S4.
		String S6 = "Tania";// this will also not create any new object inside SCP memory as is already created inside SCP. Then not
		//JVM internal reference , S6 will refer to that object. 
	}

}
