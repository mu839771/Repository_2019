package com.javaeight.streamexample;

import java.util.HashSet;
import java.util.Set;

class EmployeeDetails {
	String name;
	String dept;
	Integer salary;
	EmployeeDetails(String name,String dept,Integer salary)
	{
		this.name=name;
		this.dept=dept;
		this.salary=salary;
	}
	public String toString()
	{
		return "Name : " +this.name+" ... Department : "+this.dept+" ....Salary : "+this.salary;
	}
}
public class StreamDemoOne {
public static void main(String[] args) {
Set<EmployeeDetails> set = new HashSet<EmployeeDetails>();
	
	set.add(new EmployeeDetails("Mukesh","JPMC",96000));
	set.add(new EmployeeDetails("Vishal","Huwaei",26000));
	set.add(new EmployeeDetails("Sohan","JPMC",25000));
	set.stream().forEach(ed->{
		System.out.println(ed);
		System.out.println();
	});
}
}
