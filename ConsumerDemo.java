package com.functionalinterface;

import java.util.function.Consumer;
//represents an operation that accepts a single input argument and returns no result  
public class ConsumerDemo {
public static void main(String[] args) {
	Consumer<String> consumer = s-> System.out.println(s);
	consumer.accept("Mukesh");
	
}
}
