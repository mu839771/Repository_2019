package com.functionalinterface;

import java.util.function.Supplier;
//represents a supplier of results
//There is no requirement that a new result will be returned each time the supplier is invoked
public class SupplierDemo {
public static void main(String[] args) {
	
	Supplier<Double> sup = ()-> Math.random();
	
	System.out.println(sup.get());
}
}
