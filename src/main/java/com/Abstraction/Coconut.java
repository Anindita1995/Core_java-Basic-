package com.Abstraction;

public class Coconut extends Fruit{

	

	@Override
	void flower() {
		System.out.println("Coconut tree does not have flower");
		
	}

	@Override
	void branches() {
		System.out.println("Coconut tree does not have branches");
		
	}

	@Override
	void taste() {
		System.out.println("Coconut has sweet water");
		
	}

}
