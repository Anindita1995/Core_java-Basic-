package com.accessmodifier;

public class AccessModifier {
	public void statement1() {
		System.out.println("[I am statement 1. \nI am Public]");
	}
	protected void statement2() {
		System.out.println("[I am statement 2.\nI am protected.]");
	}
	private void statement3() {
		System.out.println("[I am statement3.\nand I am private]");
	}
public static void main(String[] args) {
	AccessModifier am = new AccessModifier();
	//am.statement1();
	//am.statement2();
	am.statement3();//protected.
}
}
