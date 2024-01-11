package com.collection;

import java.util.Comparator;

public class CompareBySalary implements Comparator<Employee2>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(Employee2 o1, Employee2 o2) {
		// TODO Auto-generated method stub
		
		if (o1.empname.equals(o2.empname)) {
			if (o1.salary==o2.salary) 
				return 0;
			else if (o1.salary>o2.salary) 
				return 1;
			else
				return -1;
	
		}
		else
		return o1.empname.compareTo(o2.empname);
			
		
			
		
	}

	

	

}
