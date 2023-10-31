package com.test2;
//10.  Create class Teacher with following fields [3]
//Tid,Tname,MobileNo
//Parameterized constructor
//abstract void salary()
//•	Create class Hourlybased which is derived class from teacher
//with fields
//rate_per_hr,
//int hrs;
//Parameterized constructor
//void salary()
//•	Create class SalaryBased which is derived class from teacher
//with fields
//int salary;
//Parameterized constructor
//void salary()
//Write main to create objects of HourlyBased teacher
//and SalaryBased teacher and also call respective salary method and also show 
//runtime polymorphism
public class SalaryBased extends Teacher {
	int salary;
	SalaryBased(){
		salary=0;
	}
	SalaryBased(int tid, String tname, long mobileno, int salary){
		super(tid, tname, mobileno);
		this.salary=salary;
	}
	public void salary() {
	    System.out.println(" SalaryBased " + salary);
	}
	public String toString() {
		return super.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalaryBased s1 = new SalaryBased(1, "Suraj", 9975924911l, 56000);
		System.out.println(s1);
		s1.salary();
	}

}
