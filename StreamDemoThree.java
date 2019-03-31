package com.javaeight.streamexample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Employee
{
	String name;
	Integer salary;
	Employee(String name,Integer salary)
	{
		this.name=name;
		this.salary=salary;
	}
}

public class StreamDemoThree {
	public static void main(String[] args) {
		List<Employee> eList = new ArrayList<Employee>();
		eList.add(new Employee("Mukesh", 50000));
		eList.add(new Employee("Kumar", 60000));
		eList.add(new Employee("Palvit", 70000));
		Predicate<Employee> ePredicate = e -> e.salary > 60000;
		for (Employee e1 : eList) {
			if (ePredicate.test(e1)) {
				System.out.println(e1.name + " : " + e1.salary);
				System.out.println("Example one ends here");
			}
		}

		// Example 2 Using filter
		List<Employee> efList = eList.stream().filter(ef -> ef.salary > 60000).collect(Collectors.toList());
		efList.stream().forEach(e -> System.out.println(e.name + ":" + e.salary));

		System.out.println("Example two ends here");
		// Example 4 removeif method is added in 1.8 version which takes the argument of
		// type predicate

		eList.removeIf(e2 -> e2.name.equals("Mukesh"));

		eList.forEach(e2 -> System.out.println(e2.name + ":" + e2.salary));

	}
}
