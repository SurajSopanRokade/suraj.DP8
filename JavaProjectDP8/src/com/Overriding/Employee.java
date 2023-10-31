package com.Overriding;
//5)WAP to create class Programmer with Method workingHours().
//create class Employee which extends Programmer implement workingHours()differently in child.
public class Employee extends Programmer{
	int working;
	Employee(){
		working=0;
	}
	Employee(int workinghrs, int w){
		super(workinghrs);
		this.working=w;
	}
	public int getWorkinghours() {
		return working;
	}

	public void setWorkinghours(int working) {
		this.working = working;
	}
	
	public int  workinghours() {
		int s=super.workinghours() + working;
		super.setWorkinghrs(s);
		return s;
	}
	public String toString() {
		return super.toString()+ "Working" + working;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(12, 5);
		System.out.println(e1.workinghours());
	}

	

}
