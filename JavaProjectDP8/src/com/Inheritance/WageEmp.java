package com.Inheritance;

public class WageEmp extends Employee {
	int hrs;
	double rate;
	
	WageEmp(){
		super();
		hrs=0;
		rate=0;
	}
	WageEmp(int id, double salary, String name, MyDate d, int hrs, double rate){
		super(id, salary, name, d);
		this.hrs=hrs;
		this.rate=rate;
		
		
	}
	
	public int getHrs() {
		return hrs;
	}
	public void setHrs(int hrs) {
		this.hrs = hrs;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public double calculateSalary() {
		double s=super.calculateSalary()+hrs*rate;
		super.setSalary(s);
		return s;
	}
	public String toString() {
	 return super.toString() +" time "+hrs+" Rate "+rate;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WageEmp w1 = new WageEmp(1, 23000, "Suraj", new MyDate(12,3,2022), 12, 3);
		System.out.println(w1);
		System.out.println(w1.calculateSalary());
		
	}

}
