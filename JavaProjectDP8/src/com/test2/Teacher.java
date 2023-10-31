package com.test2;
//10.  Create class Teacher with following fields [3]
//		Tid,Tname,MobileNo
//		Parameterized constructor
//		abstract void salary()
//	•	Create class Hourlybased which is derived class from teacher
//		with fields
//		 rate_per_hr,
//		int hrs;
//		Parameterized constructor
//		void salary()
//	•	Create class SalaryBased which is derived class from teacher
//		with fields
//		 int salary;
//		Parameterized constructor
//		void salary()
//	Write main to create objects of HourlyBased teacher and SalaryBased teacher and also call respective salary method and also show runtime polymorphism

public abstract class Teacher {
	public int tid;
	public String tname;
	public long mobileno;
	
	Teacher(){
		tid=0;
		tname="";
		mobileno=0;
	}
	Teacher(int tid, String tname, long mobileno){
		this.tid=tid;
		this.tname=tname;
		this.mobileno=mobileno;
	}
	abstract void salary();
	public String toString() {
		return " Teacher id "+tid+"\n"+" Teacher name "+tname+"\n"+" Mobile no " + mobileno;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
