package com.functionalinterface;

//represents a function which accepts one argument and produces a result 

import java.util.function.Function;

public class FunctionDemo {
	public static void main(String[] args) {
		Function<Integer,Integer> f = i->i*i;
		Integer square = f.apply(4);
		System.out.println(square);
}
	
}
