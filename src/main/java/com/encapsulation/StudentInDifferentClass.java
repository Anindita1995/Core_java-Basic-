package com.encapsulation;

public class StudentInDifferentClass {
public static void main(String[] args) {
	Student st = new Student("Adrw","12/B LA",9);
	st.displayname();//public
	//st.displayaddress();//private
	st.displayrollno();//protected
}
}
