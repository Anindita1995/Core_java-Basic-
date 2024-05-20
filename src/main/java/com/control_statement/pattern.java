package com.control_statement;

public class pattern {
public static void main(String[] args) {
	
	System.out.println("-----------1.Square------------------------");
	for(int i =1;i<=5;i++) {
		for(int j=1;j<=5;j++) {
		System.out.print("* ");
	 }
System.out.println();}
	System.out.println("------------2.Increase Triangle------------");
	
	for(int i =1;i<=5;i++) {
		for(int j=1;j<=i;j++) {
		System.out.print("* ");
	 }
System.out.println();}
	System.out.println("------------3.Decrease Triangle-------------");
	
	for(int i =1;i<=5;i++) {
		for(int j=i;j<=5;j++) {
		System.out.print("* ");
	 }System.out.println();
		}
	System.out.println("-------------4.Right Angle triangle--------------");
	for(int i =1;i<=5;i++) {
		for(int j=i;j<=5;j++) {
		System.out.print("  ");
		}
	for(int j=1;j<=i;j++) {
		System.out.print("* ");
	}
		System.out.println();
		}
	System.out.println("--------------5.opposit right angle triangle--------------------");
for(int i=1;i<=5;i++) {
	for(int j=1;j<=i;j++) {
		System.out.print("  ");
	}
	for(int j=i;j<=5;j++) {
		System.out.print("* ");
	}
	
	System.out.println();
}

}

}
