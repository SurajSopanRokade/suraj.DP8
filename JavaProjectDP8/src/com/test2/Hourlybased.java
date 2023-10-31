package com.test2;
//10.  Create class Teacher with following fields [3]
//Tid,Tname,MobileNo
//Parameterized constructor
//abstract void salary()
//•	Create class Hourlybased which is derived class from teacher
//with fields
// rate_per_hr,
//int hrs;
//Parameterized constructor
//void salary()
//•	Create class SalaryBased which is derived class from teacher
//with fields
// int salary;
//Parameterized constructor
//void salary()
//Write main to create objects of HourlyBased teacher
//and SalaryBased teacher and also call respective salary method and also show 
//runtime polymorphism
public class Hourlybased extends Teacher {
	public int rate_per_hr;
	public int hrs;
	
	Hourlybased(){
		rate_per_hr=0;
		hrs=0;
	}
	Hourlybased(int tid, String tname, long mobileno, int rate_per_hr, int hrs){
		super(tid, tname, mobileno);
		this.rate_per_hr=rate_per_hr;
		this.hrs=hrs;
	}
	@Override
	public void salary() {
		int salary=rate_per_hr*hrs;
		System.out.println(" Salary "+salary);
	}
	public String toString() {
		return super.toString()+"\n"+" rate_per_hr " + rate_per_hr + "\n"+ " HRS " + hrs;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hourlybased h1 = new Hourlybased(1, "Suraj", 9975924911l, 50, 6);
		System.out.println(h1);
		h1.salary();
	}
	

}
