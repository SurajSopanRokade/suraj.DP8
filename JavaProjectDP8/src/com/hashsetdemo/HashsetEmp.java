package com.hashsetdemo;
//12. WAP to add user defined objects of type Employee in a HashSet. 
//Print the contents in the Set.
//13.WAP to add user defined objects of type Employee in a 
//HashSet using duplicate Employee object.
import java.util.HashSet;
import java.util.Iterator;

public class HashsetEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(12,"Suraj",45000);
		Employee e2 = new Employee(13,"Abhishek",67000);
		Employee e3 = new Employee(14,"Snehal",34000);
		Employee e4 = new Employee(15,"Maruti",68000);
		Employee e5 = new Employee(13,"Abhishek",67000);
		HashSet<Employee> set = new HashSet<Employee>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		Iterator <Employee> itr = set.iterator();

		while(itr.hasNext()) {
			Employee e=itr.next();
			System.out.println(e.eid+" "+e.ename+" "+e.salary);
	//		System.out.println(itr.next());		
		}
		
		
		

	}

}
