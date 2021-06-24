package com.srm.JavaTrainingQn3;

public class PersonMain {

	public static void main(String[] args) {
		Person p1=new Employee("Sumathy",23,98565979,"2 gr road",40000,"FullStack Developer","IT");
		Person p2=new Manager("Sridhar",45,989491545,"3 hp road",80000, "DB Admin", "Finance");
		p1.printSalary();
		p2.printSalary();

	}

}
