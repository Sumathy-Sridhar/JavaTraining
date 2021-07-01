package com.srm.Day9;

import java.util.*;

public class EmployeeMain {
	  
	public static void main(String[] args) {
		Employee e1=new Employee(1,"Sumathy","Manager");
		Employee e2=new Employee(2,"Mathew","Trainee");
		Employee e3=new Employee(3,"Ashok","HR");
		Employee e4=new Employee(4,"Laara","Team Lead");
		Employee e5=new Employee(5,"John","CEO");
		LinkedList<Employee> emp=new LinkedList<Employee>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		System.out.println(emp);
		ArrayList<Employee> emplist=new ArrayList<Employee>(emp);
		for(Employee ey:emplist) {
			System.out.println(ey);
		}
		

		  
	}

}
