package com.collection;

import java.util.Comparator;

public class EmplyoeesOfSameLoc implements Comparator<Employee2> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int compare(Employee2 o1, Employee2 o2) {
		// TODO Auto-generated method stub
		if( o1.dept.location.equals(o2.dept.location)); 
			return 1;
		
	}

}
