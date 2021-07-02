package com.srm.JavaDay10;

import java.util.Map;
import java.util.TreeMap;


public class EmployeeMain {

	public static void main(String[] args) {
		Employee e1=new Employee("A11","Sumathy","Manager");
		Employee e2=new Employee("B12","Mathew","Trainee");
		Employee e3=new Employee("C13","Ashok","HR");
		Employee e4=new Employee("D14","Laara","Team Lead");
		Employee e5=new Employee("E15","John","CEO");
		TreeMap<String,Employee> temp=new TreeMap<String,Employee>();
		temp.put("A11", e1);
		temp.put("B12", e2);
		temp.put("C13", e3);
		temp.put("D14", e4);
		temp.put("E15", e5);
		for(Map.Entry<String, Employee> i:temp.entrySet()) {
			System.out.println(i.getKey()+ ": "+i.getValue());
		}
		System.out.println("\nFirst Record: "+temp.get("A11"));
		System.out.println("\nEmployee Record with Id(E15): "+temp.get("E15"));


	}

}
