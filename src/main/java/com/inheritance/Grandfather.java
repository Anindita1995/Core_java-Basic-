package com.inheritance;

public class Grandfather extends CommonAssets{
	
	public String grandpaname = "Sattya";
	
	
	public static void main(String[] args) {
		Grandfather grandpa = new Grandfather();
		System.out.println("My Name: "+grandpa.grandpaname+" "+grandpa.LastName);
		grandpa.address();
		System.out.println("Assets: $"+grandpa.money);
				
	}
	
}
