package com.array;

public class MultiDimentionalArray {
	public static int x;
public static void main(String[] args) {
	int[][] array = new int[4][4];
	int k = 1;

	 //Assign values to the array
//	array[0][0] = 1;
//	array[0][1] = 2;
//	array[0][2] = 3;
//	array[0][3] = 4;
//	array[1][0] = 5;
//	array[1][1] = 6;
//	array[1][2] = 7;
//	array[1][3] = 8;
//	array[2][0] = 9;
//	array[2][1] = 10;
//	array[2][2] = 11;
//	array[2][3] = 12;
//	array[3][0] = 13;
//	array[3][1] = 14;
//	array[3][2] = 15;
//	array[3][3] = 16;
	

	// Print the array
	for (int i = 0; i < 4; i++) {//row
	  for (int j = i; j < 4; j++) {//col
		array[i][j] = k;
	    System.out.print("* ");
	    k++;
	  }
	  System.out.println();
	}
int[][] a = new int [4][4];
a[0]= new int [1];
a[1]= new int [2];
a[2]= new int [3];
a[3]= new int [4];

int b = 1;

for (int i = 0; i < 4; i++) {
	  for (int j = 1; j < i+1; j++) {
		 a[i][j] = b;
	    System.out.print(a[i][j] + "^");
	    b++;
	  }
	  System.out.println(" ");
	}



}
}
