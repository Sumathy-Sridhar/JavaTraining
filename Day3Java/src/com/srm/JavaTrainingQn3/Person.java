package com.srm.JavaTrainingQn3;

public class Person {
	String name;
	int age;
	long phonenumber;
	String address;
	float salary;
	
	Person(String name,int age,long phonenumber,String address,float salary){
		this.name=name;
		this.age=age;
		this.phonenumber=phonenumber;
		this.address=address;
		this.salary=salary;
	}
	
	void printSalary() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Phone Number: "+phonenumber);
		System.out.println("Address : "+address);
		System.out.println("Salary: "+salary);
	}
}
