package com.xworkz.pegion.internals;

public class Kettle {
	
	static {
		System.out.println("Executed a Static Block");
	}
	
	{
		System.out.println("Executed a instance Block");
	}

}
