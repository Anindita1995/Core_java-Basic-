package com.stackclass;

public class Stack {
int stck[]  = new int[10];
int tos;

Stack() {
	//initialize top of stack
	tos = -1;
}
	public static void main(String[] args) {
		Stack stk = new Stack();
		stk.pop();

	}
	
	
	
	void push(int item) {
		if(tos == 9) {
		System.out.println("Stack is full: ");
	}else {
		stck[++tos]= item;
	} 
		}
	int pop() {
		if(tos<0) {
			System.out.println("Stack underflow");
			return 0;
		}else 

			return stck[tos--];
		
	}

	
	
	
	

}
