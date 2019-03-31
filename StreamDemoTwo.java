package com.javaeight.streamexample;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

class EmployeeDetail {
	String name;
	String dept;
	Integer salary;
	EmployeeDetail(String name,String dept,Integer salary)
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
public class StreamDemoTwo {
public static void main(String[] args) {
	Set<EmployeeDetail> set = new HashSet<EmployeeDetail>();
	set.add(new EmployeeDetail("Mukesh","JPMC",124000));
	set.add(new EmployeeDetail("Vishal","Huwaei",26000));
	set.add(new EmployeeDetail("Sohan","JPMC",25000));
	System.out.println("Initial Data :");
	set.stream().forEach(e->System.out.println(e));
	System.out.println();
	Set<EmployeeDetail> setEd=	set.stream().map(e-> 
	{
	String s = e.name;
	if(s.equals("Mukesh"))
	{
		e.name="Mukesh Athaghar";
	}
	if(e.dept.equals("JPMC"))
	{
		e.dept="CTS";
	}
	return e;
	}).collect(Collectors.toSet());
	System.out.println("after map usage final  Data :");
	setEd.stream().forEach(e->System.out.println(e));
}
}
