package com.Operators;

public class Equal_methodVsOperator {

	public static void main(String[] args) {
		/* .equal() and == both are use for comparison, but they both serve 
		in different purposes and have different behavior. 
		
		While comparing two primitive data type we use == Operator as it compares the value 
		of the two data type. But if we use == Operator to compare non-primitive data type 
		such as String or Object, it will not only compare the value but also compare the 
		memory location. Each objects always have different memory allocation. So, == Operator can
		not be use in this situation. 
		
		For non primitive data type we can use .equals() method from Object class which the base/parent
		class in Java
		*/
		System.out.println("******** '== Operator' in primitive data type*********");
		int x =3;
		int y = 4;
		if(x==y) {
			System.out.println("True");;
		}else {
			System.out.println("False");
		}//output: False
		System.out.println("******** '== Operator' in non-primitive data type*********");
		String s1 = "hello world";
		String s2 = "hello world";
		
		if(s1==s2) {
			System.out.println("True");;
		}else {
			System.out.println("False");
		}//output: True
/*Above expression will print True, as we are not creating any new object. Rather it will only create 1 object 
 * in SCP memory, and both will refer to the same object.
 * */		
		String s3 = new String("Hello World");
		String s4 = new String("Hello World");
		if(s3==s4) {
			System.out.println("True");;
		}else {
			System.out.println("False");
		}//output: False
/* But this expression will print False, though the both String are same. As we use new keyword, 
 * which will create 2 objects, one in heap memory another one in SCP, and they have different memory location
 * so we can use .equal() method */ 
		if(s3.equals(s4)) {
			System.out.println("True");;
		}else {
			System.out.println("False");
		}//output: False	

	}

}
