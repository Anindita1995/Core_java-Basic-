package com.control_statement;

import java.util.Iterator;

public class statement_for_loop {
	public static void main(String[] args) {
	
/***for loop inside for loop is nested for loop
inner for loop completely executer for one execution of outer loop.
***/		
		int outer_loop = 5;
		int inner_loop = 5;
		for(int row=0;row<=outer_loop;row++) {
			System.out.println("\nFor repeation of outer loop" +row+" ");
			System.out.println("Inner loop coloumn will execute");
			for(int col=0;col<=inner_loop;col++) {
			System.out.println(col);			
			}System.out.println();	
			
		}	
		
		
		
		
	}
}
