package com.javaeight.lamdaexpresiion;
@FunctionalInterface
interface inter
{
	void myTest();
	
}

public class FuntionalInterfaceExample {

	public static void main(String[] args) {
		inter i = ()->{
			System.out.println("mytest impl");
			};
			
			i.myTest();
			
	}
	
		
	
	
}
