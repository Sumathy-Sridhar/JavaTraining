package com.srm.JavaDay10;

public class Employee {
	String eno;
	String name;
	String designation;
	
	public Employee(String eno, String name, String designation) {
		super();
		this.eno = eno;
		this.name = name;
		this.designation = designation;
	}

	public String toString() {
        return "Employee Id: " + eno + "\n Employee Name:  " +name + "\n Designation:  " + designation + "\n";
    }

}
