package com.instance_staticvariable;

public class Instance_Variable {
private String password;

public Instance_Variable(String pass){//constructor
	this.password = pass;
	System.out.println("Constructor call the instance variable: "+pass);
}
public void text() {
	System.out.println("Constructor call the instance variable: "+password);

}
public static void main(String[] args) {
	Instance_Variable iv = new Instance_Variable("1121");
	iv.text();
}

}
