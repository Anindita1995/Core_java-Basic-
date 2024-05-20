package com.argument;

public class PassByReference {
int a, b;
public PassByReference(int x, int y) {
	a=x;
	b=y;
}
void method(PassByReference pf) {
	pf.a *= 2;// at this reference whatever the value we store will multiplied by 2
	pf.b /=2;//at this reference whatever the value we store will divided by 2
}

	public static void main(String[] args) {
		PassByReference pf1 = new PassByReference(20, 100);
		//value of a, before call the the method
		System.out.println("A: "+pf1.a);//20
		 //value of b, before call the the method
	    System.out.println("B: "+pf1.b);//100
	    
	    //value after call the method
	    pf1.method(pf1);
	    System.out.println("A: "+pf1.a);//40
	    System.out.println("B: "+pf1.b);//50
	    pf1.method(pf1);
	    System.out.println("A: "+pf1.a);//80 //every time the value will be updated after calling the method
	    //value of b, before call the the method
	    System.out.println("B: "+pf1.b);//25
	    
	
	}

}
