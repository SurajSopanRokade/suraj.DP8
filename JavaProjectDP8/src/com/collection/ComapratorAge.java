package com.collection;

import java.util.Comparator;

 class ComapratorAge implements Comparator<Employee2> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(Employee2 o1, Employee2 o2) {
		// TODO Auto-generated method stub
		if (o1.age==o2.age)
			return 0;
		else if (o1.age>o2.age)
			return 1;
		else
			return -1;
	}

}
