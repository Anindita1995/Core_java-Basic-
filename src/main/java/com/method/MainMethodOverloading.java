package com.method;

public class MainMethodOverloading {
public MainMethodOverloading() {
	System.out.println("I am constructor with no parameter");
}
MainMethodOverloading(int x){
	System.out.println("I am constructor with parameter");
	
}
void display() {
	System.out.println("I am display");
}
	public static void main(String[] args) {
		MainMethodOverloading m0 = new MainMethodOverloading();
		MainMethodOverloading m1 = new MainMethodOverloading(10);
//		m0.display();
//		m1.display();
		main(100);
	}
	public static void main(int a) {
		MainMethodOverloading m2 = new MainMethodOverloading();
		MainMethodOverloading m3 = new MainMethodOverloading(10);
//		m0.display();
//		m1.display();
	}

}
