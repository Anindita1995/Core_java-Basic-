package com.control_statement;

public class Complicated_Incre_Decre {

	public static void main(String[] args) {
		int m = 100; 
		int n = m--; 
		System.out.println("After n =m--");
		System.out.println("Latest value of m: "+m);//99
		System.out.println("Latest value of n: "+n);//100
		int p = --m;
		System.out.println("After p = --m");
		System.out.println("Latest value of m: "+m);//98
		System.out.println("Latest value of p: "+p);//98
		int l = n--;//100
		System.out.println("After l=n--");
		System.out.println("Latest value of n: "+n);//99
		System.out.println("Latest value of l: "+l);//100
//		int z = --p+--n; //97+98=195
//		System.out.println("After z = --p + --n");
//		System.out.println("Latest value of n: "+n);//98
//		System.out.println("Latest value of p: "+p);//97
//		System.out.println("Latest value of z: "+z);//195
		int z1 = p--+--n; //98+98= 196
		System.out.println("After z = p-- + --n");
		System.out.println("Latest value of n: "+n);//98
		System.out.println("Latest value of p: "+p);//97
		System.out.println("Latest value of z: "+z1);//196
		
		
		
		System.out.println("The value of n is: "+n);//98
		System.out.println("This post increment parameter will print: "+n++);//98
		System.out.println("This pre increment parameter will print: "+ ++n);//100
		System.out.println("This post decrement parameter will print: "+n--);//100
		System.out.println("This pre decrement parameter will print: "+ --n);//98
		
	}

}
