package com.srm.JavaDay10;
import java.util.*;
public class ComparatorDemo {

	public static void main(String[] args) {
		ArrayList<Employee> emparr=new ArrayList<Employee>();
		Employee e1=new Employee("A11","Sumathy","Manager");
		Employee e2=new Employee("B12","Mathew","Trainee");
		Employee e3=new Employee("C13","Ashok","HR");
		Employee e4=new Employee("D14","Laara","Team Lead");
		Employee e5=new Employee("E15","John","CEO");
		emparr.add(e1);
		emparr.add(e2);
		emparr.add(e3);
		emparr.add(e4);
		emparr.add(e5);
		System.out.println("Employee Details: ");
		System.out.println("************");
		for(int i=0;i<emparr.size();i++)
		{
			System.out.println(emparr.get(i));
		}
		Collections.sort(emparr,new sortByEmpID());
		System.out.println("\nEmployee Details (SortedByID): ");
		System.out.println("************");
		for(int i=0;i<emparr.size();i++)
		{
			System.out.println(emparr.get(i));
		}
		Collections.sort(emparr,new sortByEmpName());
		System.out.println("\nEmployee Details (SortedByName): ");
		System.out.println("************");
		for(int i=0;i<emparr.size();i++)
		{
			System.out.println(emparr.get(i));
		}	
	}
	}

