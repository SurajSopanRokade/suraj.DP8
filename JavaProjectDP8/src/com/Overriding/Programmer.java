package com.Overriding;
//5)WAP to create class Programmer with Method workingHours().
//create class Employee which extends Programmer implement workingHours()differently in child.
public class Programmer {
	int workinghrs;
	Programmer(){
		workinghrs=0;
	}
	Programmer(int workinghrs){
		this.workinghrs=workinghrs;
	}
	public int workinghours() {
		
		return workinghrs;
	}
	public int getWorkinghrs() {
		return workinghrs;
	}
	public void setWorkinghrs(int workinghrs) {
		this.workinghrs = workinghrs;
	}
	public String toString() {
		return " workinghours "+ workinghrs ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programmer p1 = new Programmer();
		p1.workinghours();
		System.out.println(p1);
	}
	
	
	
		
	}
	
	


