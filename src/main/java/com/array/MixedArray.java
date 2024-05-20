package com.array;

public class MixedArray {

	public static void main(String[] args) {
		/*In java we can not store different data type into a single array.
		But this can be achieved by using an array type Object, as we know
		all the class by default inherit java.lang.object class. */
		
		Object[] mixedarray = new Object[5];
		mixedarray[0]= 1;// int type of data
		mixedarray[1]= "Biriyani";// String type of data
		mixedarray[2]= true;// boolean type of data
		mixedarray[3]= 10.0089;// double precision type of data
		mixedarray[4]= 0X10;// hexadecimal type of data
		for(Object element:mixedarray) {
			System.out.println("Different type of data : "+element);
		}
	}

}
