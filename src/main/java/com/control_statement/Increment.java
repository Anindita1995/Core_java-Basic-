package com.control_statement;

public class Increment {

	public static void main(String[] args) {
//-----------POST INCREMENT------------------//
		int i = 10;
		int j = i++;
		
		System.out.println("Value of 'i': "+i);//i(11) latest value of 'i'
											   //after post increment 
		System.out.println("Value of 'j': "+j);//'j' will consider as a
											//(j=i(10))
		
		System.out.println();
		
		int x = j++;					
	
		System.out.println("Value of 'x': "+x);//10; 'x' will consider as a (x = j(10))
		System.out.println("Value of 'j': "+j);//11 j(11) after post increment of x;
		System.out.println("Value of 'i': "+i);//11*** Here "i" 
											   //will remain unchanged 
//*****When post increment operation execute it changes the value of previous variable;
		
		System.out.println("----------------PRE-INCREMENT--------------------");
//----------------PRE-INCREMENT--------------------//
		int a=12;
		int b=++a;
		System.out.println("Value of 'a': "+a);//13
		System.out.println("Value of 'b': "+b);//13** Because of 
		//*****the pre_increment the value of b already became 13
		System.out.println();
		int a1 = 20;//21
		int b1 = ++a1;//22
		int c1 = ++b1;//22
		System.out.println("Value of a1: "+a1);//a1(21) because of pre_increment of b1;
		System.out.println("Value of b1: "+b1);//b1=21, because of pre_increment
		System.out.println("Value of c1: "+c1);//c1(22), because of pre_increment
											   //b1(22), because of pre_increment of c1; 	
		//*****When pre-increment operation execute it changes it's own value and also the value of previous variable;
	}

}
