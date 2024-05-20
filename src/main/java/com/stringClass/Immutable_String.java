package com.stringClass;

public class Immutable_String {

	public static void main(String[] args) {
		//Immutable: which is not changeable. 
		//String Objects are immutable. 
		String S = new String("Anindita");//2 objects will be created, one in heap memory and another one in SCP memory. 
		System.out.println(S);//Output will be Anindita
		S.concat("Roy");//we are using concat() method from String Class
		System.out.println(S);//Again the the output will be Anindita. because using 'S.concat()' will not change the 
		//value of the String object. This concatenation method will create another object 'Anindita Roy' in heap memory. 
		String S1  = S.concat("Roy");// if you store the concatenated value in another the String object and print, 
		//the output will show the value from the new object.
		System.out.println(S1);// output will be 'Anindita Roy'
		//String is designed to be immutable as it is used to store the object in to the String Pool. Immutability prevent to 
		// change the value of the objects. 
		// JVM uses to store the value in Sting Pool/SCP, When new object created it checks the existing value of the pool. The 
		//If the value exists, it will return the same reference to that object. So immutability allows multiple thread, 
	}

}
