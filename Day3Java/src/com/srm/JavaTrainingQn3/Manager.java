package com.srm.JavaTrainingQn3;

public class Manager extends Person{
	private String specialization;
	private String department;
	
	Manager(String name,int age,long phonenumber,String address,float salary,String specialization,String department){
		super(name,age,phonenumber,address,salary);
		this.specialization=specialization;
		this.department=department;
	}
	
	void printSalary() {
		super.printSalary();
		System.out.println("Manager's Specialization: "+specialization);
		System.out.println("Deparment: "+department);
		System.out.println();
	}
}
