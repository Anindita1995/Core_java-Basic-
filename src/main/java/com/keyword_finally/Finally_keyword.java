package com.keyword_finally;

public class Finally_keyword {
/*
 * finally is a block which is related to the Exception Handling, which executes
 * whether the exception occurs or not. Finally is always related to the try catch block. 
 * It executes when the try catch block is executed.And the execution is not depends on the
 * exception
 * 
 *     */
	public static void main(String[] args) {


		try {
			int i = 10;
			int j = i/0;
			System.out.println(j);//Arithmetic Exception
		} catch (ArithmeticException e) {
			
			e.printStackTrace();
		}
		finally {
			System.out.println("This is not executable");// This line will still print 
			//because of the Finally block
		}
	}

}
