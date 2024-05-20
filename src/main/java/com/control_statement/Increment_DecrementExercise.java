package com.control_statement;

public class Increment_DecrementExercise {

	public static void main(String[] args) {
	// Exercise 1:
		System.out.println("Exercise 1: ");
		int i =11;
		i = i++ + ++i;
			//11+13
		System.out.println("Exercise_1: value of i: "+i);//24
	// Exercise 2:
		System.out.println("Exercise 2: ");
		i= ++i + i++ + --i;
          //25+25+25 = 75
		System.out.println("Exercise_2: value of i: "+i);//75
		
	//Exercise 3:
		System.out.println("Exercise 3: ");
		boolean b1 = true;
		//b++; invalid expression. 
		System.out.println(b1);
		
	//	Exercise 4:
		System.out.println("Exercise 4: ");
		int a=11, b=22, c;
        
        c = a + b + a++ + b++ + ++a + ++b;
         //11 + 22 + 11 +22   +13   +24;
        System.out.println("a="+a);//13
        System.out.println("b="+b);//24
        System.out.println("c="+c);//103
        
   //Exercise 5: 
        System.out.println("Exercise 5: ");
        int i1=19, j1=29, k1;
        
        k1 = i1-- - i1++ + --j1 - ++j1 + --i1 - j1-- + ++i1 - j1++;
         	//19 - 18    +  28  - 29   + 18   - 29   + 19   - 28
        System.out.println("i="+i1);//19
        System.out.println("j="+j1);//29
        System.out.println("k="+k1);//20
	//Exercise: 6
        System.out.println("Exercise 6: ");
        int s = 11;
        //int r = --(s++); invalid expression, nested is not possible
        System.out.println("Exercise 6 is not possible");
    //Exercise 7:
        System.out.println("Exercise 7: ");
        int m = 0, n = 0;
        
        int p = --m * --n * n-- * m--;
         //     {(-1)*(-1)}*{(-1)*(-1)}
        //		{1}*{1} = 1
        System.out.println(p);//1
        //Exercise 8: 
        System.out.println("Exercise 8: ");
        char ch = "567".charAt(0);
        System.out.println(ch);//5
        System.out.println(ch++ + ++ch);
        				//0+2
        
        System.out.println("Exercise 9: ");
        char c1 ='A'; 
        char C1 = 'a';
        //System.out.println(++c1);
        System.out.println(c1++ * ++C1);
        
        System.out.println("Exercise: 10: ");
        double d = 1.5;
        double d1= 2.5;
        System.out.println(d++ + ++d1);
                         //1.5 +3.5=  5.0
        
	}

}
