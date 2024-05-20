package MentoringSession;

public class Math {
	
	
	public int add(int x,int y) {
		int c = x+y;
		System.out.println(c);
		return c;
	}
	
	
public static void main(String[] args) {
//	int x= 10;
//	int y = 5;
//	int z = x+y;
//	System.out.println(z);
//	
//	int a = 100;
//	int b = 200;
//	int c = a+b;
//	System.out.println(c);
//	
//	System.out.println(z+c);
	
	
	
	Math math_obj = new Math();
	Math math_obj2 = new Math();
	int h= math_obj.add(10, 5);
	int j= math_obj2.add(100, 200);
System.out.println(h+j);

	
	
	
}
}
