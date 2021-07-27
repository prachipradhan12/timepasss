package com.lti.lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	int id;
	String empName;
	double empSalary;
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	public Employee(int id, String empName, double empSalary) {
		super();
		this.id = id;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	
}

public class StreamClass {
	public static void main(String args[]) {
		List<Integer> number=new ArrayList<Integer>();
		number.add(30);
		number.add(20);
		number.add(10);
		number.add(70);
		number.add(80);
		number.add(55);
		number.add(30);
		number.add(30);
//		Iterator<Integer> iterator=number.iterator();
//		while(iterator.hasNext()) {
//			int num=iterator.next();
//			if(num>=30)
//			System.out.println(num);
//		}
		number
		.stream()
		.filter(num->num>=30)
		.forEach(num->System.out.println(num));
		System.out.println("============================");
		number
		.stream()
		.filter(num->num>=30)
		.distinct()
		.forEach(num->System.out.println(num));
		
		System.out.println("============================");
		System.out.println(number.stream().filter(num->num>=30).count());
		List<Employee> employee=new ArrayList<Employee>();
		employee.add(new Employee(101, "Kevin", 50000));
		employee.add(new Employee(102, "Mrak", 30000));
		employee.add(new Employee(109, "Jack", 10000));
		employee.stream()
		.filter(e->e.empSalary>=30000)
		.forEach(e->System.out.println(e.id+" "+e.empName+" "+e.empSalary));
//		.forEach(System.out::println);
		
		employee.stream()
		.map(emp->emp.getEmpName())
		.sorted()
		.forEach(System.out::println);
		//List<Employee>--->stream()--->Stream<Employee>
		List<String> employeesname=employee.stream()
		.map(emp->emp.getEmpName().toUpperCase())
		.sorted()
		.collect(Collectors.toList());
		System.out.println(employeesname);
//		.forEach(System.out::println);
	}
	
}
