package com.Inheritance;

public class SalesPerson extends WageEmp {
	int sales;
	double commission;
	
	SalesPerson(){
		super();
		sales=0;
		commission=0;
	}
	SalesPerson(int id, double salary, String name, MyDate d, int hrs, double rate, int sales, double commission){
		super(id, salary, name, d, hrs, rate);
		this.sales=sales;
		this.commission=commission;
	}
	
	public int getSales() {
		return sales;
	}
	public void setSales(int sales) {
		this.sales = sales;
	}
	public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}
	public double calculateSalary() {
		double s=super.calculateSalary()+sales*commission;
		super.setSalary(s);
		return s;
	}
	public String toString() {
		return super.toString()+"Sales"+sales+ " Commission " + commission;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalesPerson s1 = new SalesPerson(1, 23000, "Suraj", new MyDate(12,2,2022), 10,3, 5, 2);
		System.out.println(s1.calculateSalary());
		System.out.println(s1);
	}

}
