package com.control_statement;

public class statement_While_outer_For_inner {

	public static void main(String[] args) {
		int i = 1;
		while(i<=5) {//outer loop
		System.out.println("Repetition of while loop"+i);
		//i++;
		for(int j=1;j<5;j++) {//inner loop
			System.out.println("i= "+i+":j "+j);
		}
		i++;
		}

	}

}
