package com.objectofclass;

public class ObjectParameter {
int a=10;
int b=10;
int c=10;
ObjectParameter(int a, int b, int c) {
	this.a = a;
	this.b = b;
	this.c = c;
}
boolean equals(ObjectParameter o) {
	if(o.a==a&&o.b==b&&o.c==c) {
		return true;
	}else return false;
}
	public static void main(String[] args) {
		ObjectParameter op1 = new ObjectParameter(10, 1, 100);
		ObjectParameter op2 = new ObjectParameter(10, 178, 100);
		System.out.println("op1 == ob2 "+op1.equals(op2));
	}

}
