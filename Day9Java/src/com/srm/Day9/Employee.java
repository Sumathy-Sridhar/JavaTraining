package com.srm.Day9;

public class Employee {
	int eno;
	String name;
	String designation;
	
	Employee(int eno,String name,String designation){
		this.eno=eno;
		this.name=name;
		this.designation=designation;
	}
    public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String toString() {
        return "Employee Id: " + eno + "\n Employee Name:  " +name + "\n Designation:  " + designation + "\n";
    }

}
