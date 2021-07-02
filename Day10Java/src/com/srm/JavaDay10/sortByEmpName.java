package com.srm.JavaDay10;

import java.util.Comparator;

public class sortByEmpName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.eno.compareTo(o2.eno);
	}

}
