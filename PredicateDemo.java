package com.functionalinterface;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//Predicate is function interface which contains inside java.util.function
//Predicate function interface just check condition it does not return anything

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

public class PredicateDemo {
	public static void main(String[] args) {
		// Example 1
		String[] names = { "Mukesh", "Kumar" };

		Predicate<String> p = s -> s.length() > 5;

		for (String name : names) {
			if (p.test(name)) {
				System.out.println(name);
				System.out.println("Example one ends here**************************");
			}
		}
		List<Employee> eList = new ArrayList<Employee>();
		eList.add(new Employee("Mukesh", 50000));
		eList.add(new Employee("Kumar", 60000));
		eList.add(new Employee("Palvit", 70000));
		Predicate<Employee> ePredicate = e -> e.salary > 60000;
		for (Employee e1 : eList) {
			if (ePredicate.test(e1)) {
				System.out.println(e1.name + " : " + e1.salary);
				System.out.println("Example two ends here");
			}
		}
	}
}
