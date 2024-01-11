package com.Covariant;

public class Manager extends Employee{
	int noofemp;
	Manager(){
		noofemp=24;
	}
	Manager(int eid, String name ){
		super(eid, name);
		
	}
	public Manager getEmployee() {
		return new Manager();
	}
	@Override
	public String toString() {
		return "Manager [noofemp=" + noofemp + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m1 = new Manager(1, "Suraj");
		Manager o= m1.getEmployee();
		System.out.println(o);
	}

}
