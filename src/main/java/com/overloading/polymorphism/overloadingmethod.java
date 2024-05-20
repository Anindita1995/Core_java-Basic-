package com.overloading.polymorphism;

public class overloadingmethod {
	
	public static void main(String[] args) {
		
		int x = add(1,2);
		System.out.println(x);
		int y = add(1,2,3);
		System.out.println(y);
		int z = add(1,2,3,4);
		System.out.println(z);
		
		double a = add(1.0,0.32);
		System.out.println(a);
		double b = add(1.1,1.02,3.21);
		System.out.println(b);
		double c = add(5.1,2.0,3.2,4.1);
		System.out.println(c);

}
	public static int add(int a,int b) {
		System.out.print("Answer is from method #1: ");
		return a+b;
	}
	public static int add(int a,int b, int c) {
		System.out.print("Answer is from method #2: ");
		return a+b+c;
	}
	public static int add(int a,int b,int c,int d) {
		System.out.print("Answer is from method #3: ");
		return a+b+c+d;
	}
	
	public static double add(double a,double b) {
		System.out.print("Answer is from method #4: ");
		return a+b;
	}
	public static double add(double a,double b, double c) {
		System.out.print("Answer is from method #5: ");
		return a+b+c;
	}
	public static double add(double a,double b,double c,double d) {
		System.out.print("Answer is from method #6: ");
		return a+b+c+d;
	}
}
