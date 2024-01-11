package com.Inheritance;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;



public class WageEmp extends Employee implements Serializable {
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
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		WageEmp w1 = new WageEmp(1, 23000, "Suraj", new MyDate(12,3,2022), 12, 3);
		System.out.println(w1);
		System.out.println(w1.calculateSalary());
		FileOutputStream fos=new FileOutputStream("D:\\Dp8 Java\\Github\\JavaProjectDP8\\src\\wageemp.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(w1);
		oos.flush();
		oos.close();
		fos.close();
		System.out.println(w1);
		System.out.println("Object Saved");
		
		FileInputStream fis=new FileInputStream("D:\\Dp8 Java\\Github\\JavaProjectDP8\\src\\wageemp.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		WageEmp s1=(WageEmp) ois.readObject();
		System.out.println("Object shown");
		System.out.println(s1);
		ois.close();
		fis.close();
		
		
	}

}
