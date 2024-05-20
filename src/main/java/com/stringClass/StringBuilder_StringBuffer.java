package com.stringClass;

public class StringBuilder_StringBuffer {

	public static void main(String[] args) {
		// So basically String Literal is immutable, means it can not be changed, 
		//So to make it mutable StringBuffer is introduced. StringBuffer makes the String mutable
		//For Example: (String Literal)
		System.out.println("************String Literal*************");
		String S = new String("Selenium");
		S.concat(" Java");
		System.out.println("1st Output of S: "+S);//It did not change the original value of 'S'. So the output will be 'Selenium'
		S = S.concat(" Java");//In heap memory it will create new object 'Selenium Java'
		System.out.println("2nd Output of S: "+S);//Now the output will be 'Selenium Java'
		//Example: (String Buffer)
		System.out.println("************String Buffer*************");
		StringBuffer  strbfr1 = new StringBuffer("Web");
		strbfr1.append(" application");//append is a method of StringBuffer similar to concat() method
		System.out.println("Output of 1st string_buffer: "+strbfr1);//this method will change the value of strbfr1 and the output will 
		//be 'Web application'
		
		//All the methods of String Buffer are synchronized. 
		StringBuffer S1 = new StringBuffer();//empty
		System.out.println("1st Capacity: "+S1.capacity());//this capacity will print the by default amount of characters S1 will hold
		//S1 will hold 16 characters which means 16*2 = 32 bytes. But output will show the 16 characters.
		//Now if we pass the value, which contains 16 or less characters in StringBuffer, capacity() will
		//through the output as 16. 
		S1.append("Java ");//append() method will concatenate Java
		System.out.println("1st Updated value of S1: "+S1);
		System.out.println("2nd capacity: "+S1.capacity());
		///////
		S1.append("ABCD EFGH IJKL MNOP ");//20
		System.out.println("2nd Updated value of S1: "+S1);
		System.out.println("3rd: capacity: "+ S1.capacity());//it would have print 25 characters. it will not. 
		// it will hold the value: (old capacity *2)+2 = (16*2)+2 = 34
		System.out.println("************String Builder*************");
		//Example: (String Builder)
		StringBuilder S2 = new StringBuilder();
		S2.append("Santa ");
		System.out.println(S2);
		System.out.println("String builder S2: "+S2.capacity());
		S2.append("Clara 567hjklmnbgtredfgh");
		System.out.println(S2);
		System.out.println("String builder S2: "+S2.capacity());
		
/*String Builder and String Buffer both are used for same purpose which is to make the String 
mutable. 
But, String builder is synchronized that is why it is safe for multi-thread purpose, which means multiple objects 
references can refer to the same object in SCP without inconsistent results. But because of being synchronized it slows down 
the performance of the program. On the other hand, String builder is non synchronized, meaning it does not support multi-threading.
It can only be used in single threading, other wise it will provide inconsistent results. That is why it is faster than Sring 
Buffer.   */
	}

}
