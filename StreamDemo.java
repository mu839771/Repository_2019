package com.javaeight.streamexample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 15, 20, 25, 30, 35);
		List<Integer> list1 = list.stream().filter(i -> i > 20).collect(Collectors.toList());
		Integer sum = 0;
		for (Integer i : list1) {
			sum = sum + i;
		}
		System.out.println("Total sum : " + sum);
		System.out.println("Initial List " + list1);
		System.out.println("********Map in stream *****************************");
		List<Integer> list2 = list.stream().map(i -> i + 1000).collect(Collectors.toList());
		System.out.println(list2);
		System.out.println("************for each in stream ********************");
		list2.stream().forEach(i -> {
			System.out.println("Stream--->" + i);
		});
		System.out.println("*********** parallelStream ************************");
		list2.parallelStream().forEach(i -> {
			System.out.println("parallel Stream--->" + i);
		});
		System.out.println("****** count method in stream *********************");
		long noOfElments = list2.stream().count();
		System.out.println("noOfElments--->" + noOfElments);
	}
}
