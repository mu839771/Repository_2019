package com.test;


import java.util.Arrays;
import java.util.List;

class MyDAOImpl
{
	public static List<Integer> fetch()
	{
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		return list;
	}
}



public class MethodReferenceDemo {
public static void main(String[] args) {
	List<String> list = Arrays.asList("Mukesh","Kumar","Palvit");
	
	list.forEach(System.out::println);
	
	// List<Integer> list1 = MyDAOImpl.fetch();
	


}


}
