package com.hashmapAssign;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class EmpTask {
	public static double calculateMaxSal(List<Employee> list) {
		double max=0;
		Employee e =null;
		for (int i=0; i<list.size(); i++) {
			if(list.get(i).salary>max) {
				max=list.get(i).salary;
				e=list.get(i);
			}
		}
//		System.out.println("Max = "+ max + "Employee = "+e);
		return max;
	}
//	public static Department calculateless70k(HashMap<Department, ArrayList<Employee>> map,Department e2) {
//		Set<Entry<Department, ArrayList<Employee>>> s1 = map.entrySet();
//		Department e1 =null;
//		for (Entry<Department, ArrayList<Employee>>e:s1) {
//			if(e.getKey().depname.equals(e2.depname)) {
//				e1=e.getKey();
//			}
//			
//		}
//		return e1;
//	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department d1 = new Department(100, "IT", "pune");
		Department d2 = new Department(101, "HR", "Mumbai");
		Department d3= new Department(102, "Marketing", "Channai");
		Department d4 = new Department(103, "Testing", "Goa");
		
		ArrayList<Employee> list= new ArrayList<>();
		list.add(new Employee(21, 100, "Sudarshan", 500000000));
		list.add(new Employee(22, 100, "Snehal", 1800000));
		list.add(new Employee(23, 100, "Adharsh", 450000000));
		list.add(new Employee(24, 100, "Suraj", 500000000));
		
		ArrayList<Employee> list1= new ArrayList<>();
		list1.add(new Employee(25, 101, "Pritam", 900000000));
		list1.add(new Employee(26, 101, "Yogesh", 800000000));
		list1.add(new Employee(27, 101, "AdharshN", 70000000));
		list1.add(new Employee(28, 101, "Abhishek", 40000000));
		list1.add(new Employee(78, 101, "Abhi", 4000000));
		
		ArrayList<Employee> list2= new ArrayList<>();
		list2.add(new Employee(29, 102, "Maruti", 500000000));
		list2.add(new Employee(30, 102, "Utkarsha", 900000000));
		list2.add(new Employee(31, 102, "Sunish", 50000000));
		list2.add(new Employee(32, 102, "Prashant", 10000000));
		
		ArrayList<Employee> list3= new ArrayList<>();
		list3.add(new Employee(33, 103, "Bhakti", 800000000));
		list3.add(new Employee(34, 103, "Nishank", 300000000));
		list3.add(new Employee(35, 103, "Yash", 50000000));
		list3.add(new Employee(36, 103, "Ram", 30000000));
		
		HashMap<Department, ArrayList<Employee>> map = new HashMap<>();
		map.put(d1, list);
		map.put(d2, list1);
		map.put(d3, list2);
		map.put(d4, list3);
		
		Set<Entry<Department, ArrayList<Employee>>> set = map.entrySet();
		Iterator<Entry<Department, ArrayList<Employee>>> itr = set.iterator();
		
		while (itr.hasNext()) {
			Entry<Department, ArrayList<Employee>> ele = itr.next();
			Department obj = ele.getKey();
			if (obj.depname.equals("Testing")) {
				ArrayList<Employee> list4 = ele.getValue();
				Employee e = new Employee(45, 103, "Ganesh",67000000 );
				list4.add(e);
				map.put(obj, list4);
			}
			
		}
		for (Entry<Department, ArrayList<Employee>> e : map.entrySet()) {
	//		System.out.println(e.getKey());
			ArrayList<Employee> list5 = e.getValue();
			for (Employee r: list5) {
	//			System.out.println("\t"+r);
			}
			
		}
		System.out.println(map.get(new Department(102, "Marketing", "Channai")));
	
		
	
//		while(itr.hasNext()) {
//			Entry<Department, ArrayList<Employee>> ele = itr.next();
//			Department obj = ele.getKey();
//			System.out.println("*Dept id : "+obj.getDepid()+" , "+"*Dept name : "+obj.getDepname());
//			ArrayList<Employee> list4=ele.getValue();
//			Iterator <Employee> itr1 = list4.iterator();
//			while (itr1.hasNext()) {
//				System.out.println(itr1.next());
//			}
//			System.out.println("__________________________________________________");
//		}
//		while(itr.hasNext()) {
//			Entry<Department, ArrayList<Employee>> ele = itr.next();
//			Department obj = ele.getKey();
//			System.out.println("Dept id : "+obj.getDepid()+" , "+"Dept name : "+obj.depname);
//			ArrayList<Employee> list4 = ele.getValue();
//			Employee e = null;
//			double max=0;
//			Iterator<Employee> itr1 = list4.iterator();
//			while(itr1.hasNext()) {
//				Employee obj1 = itr1.next();
//				if (obj1.getSalary()>max) {
//					max=obj1.getSalary();
//					e=obj1;
//				}
//				
//			}
//			System.out.println("Max salary : "+max+" "+" Employee info : "+e);
//		}
//		Department obj1 = null;
//		ArrayList<Employee> list5 = null;
//		int max=0;
//		while (itr.hasNext()) {
//			Entry<Department, ArrayList<Employee>> ele = itr.next();
//			Department obj = ele.getKey();
////			System.out.println("Dept id : " + obj.depid+" , "+ "Dept name : "+ obj.depname);
//			ArrayList<Employee> list4 = ele.getValue();
//			int a=ele.getValue().size();
////			System.out.println("Number of employees : "+a);
//			max=0;
//			if (a>max) {
//				max=a;
//
//				obj1 = obj;
//			}
//			
//		}
//		System.out.println("Dept id : "+obj1.depid+"Dept name : "+obj1.depname);

		
		
//		System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		Collection<ArrayList<Employee>> ob=map.values();
//		Employee b =calculateMaxSal(list);
//		System.out.println("Max sal employee form list = "+b);
//		System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
//		Employee c =calculateMaxSal(list1);
//		System.out.println("Max sal employee form list1 = "+c);
//		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
//		Employee d =calculateMaxSal(list2);
//		System.out.println("Max sal employee form list2 = "+d);
//		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
//		Employee e =calculateMaxSal(list3);
//		System.out.println("Max sal employee form list3 = "+e);
//		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		
//		for (Entry<Department, ArrayList<Employee>> m:map.entrySet()) {
//			Iterator<Employee> emp1 = m.getValue().iterator();
//			while(emp1.hasNext()) {
//				Employee emp2 = emp1.next();
//				if (emp2.getSalary()==calculateMaxSal(m.getValue())) {
//					System.out.println(emp2);
//				}
//				
//			}
//			System.out.println();
//		}
//		String str ="IT";
//		for (Entry<Department, ArrayList<Employee>> m:map.entrySet()) {
//			Iterator<Employee> emp1 = m.getValue().iterator();
//			
//			while(emp1.hasNext()) {
//				Employee emp2 = emp1.next();
//				if(m.getKey().depname==str) {
//					if (emp2.salary<70000) {
//						System.out.println(emp2);
//						
//					}
//				}
//			}
//			System.out.println();
//		}
//	list3.add(new Employee(37, 103, "Sham", 50000000));
//	map.put(d4, list3);
	
		
		
	}
	

}
