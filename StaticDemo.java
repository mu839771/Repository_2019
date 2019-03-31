package com.javaeight.staticexample;

interface interf
{
	 public static void myUtilityMethod()
	{
		System.out.println("myUtilityMethod");
	}
}

public class StaticDemo {
public static void main(String[] args) {
	interf.myUtilityMethod();
}
}
