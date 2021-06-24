package com.srm.JavaTrainingQn3;

public class Employee extends Person{
	private String specialization;
	private String department;
	
	Employee(String name,int age,long phonenumber,String address,float salary,String specialization,String department){
		super(name,age,phonenumber,address,salary);
		this.specialization=specialization;
		this.department=department;
	}
	
	void printSalary() {
		super.printSalary();
		System.out.println("Employee's Specialization: "+specialization);
		System.out.println("Deparment: "+department);
		System.out.println();
	}
}
