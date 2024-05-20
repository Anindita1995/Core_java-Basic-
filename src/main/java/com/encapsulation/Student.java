package com.encapsulation;

public class Student {
	public String name;
	private String address;
	protected int roll;
	
	public Student(String name,String address,int roll) {
		this.name = name;
		this.address = address;
		this.roll= roll;
	}
	

	public void displayname() {
		System.out.println("Student's Name: "+name);
	}
	private void displayaddress() {
		System.out.println("Student's address: "+address);
		
	}
	protected void displayrollno() {
		System.out.println("Roll no. "+roll);
	}
	
	public static void main(String[] args) {
		Student student = new Student("John","12/A abcd CA-90765",12);
		student.displayname();
		student.displayaddress();
		student.displayrollno();
	}

}

