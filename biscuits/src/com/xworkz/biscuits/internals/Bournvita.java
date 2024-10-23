package com.xworkz.biscuits.internals;

public class Bournvita {
	
	static {
		System.out.println("Executed a static block");
	}
	
	{
		System.out.println("Executed a instance block");
	}

}
