package com.array;

public class AvgValueofArray {
	public static void main(String[] args) {
		double number[] = {99.5,85.80,89,95.6,40.23,98,100};
		double avgnum = 0;
		for(int i = 0;i<=6;i++) {
/*
 * If you try to access elements outside the
range of the array [for example i<=7] you will cause a 
run-time error.
*/
		avgnum = avgnum+number[i];				
		}
		System.out.println("Avg is "+avgnum/7);
	}
}
