package com.test2;
//5.  Design  class Job with following fields (  id, Role, salary) [2M]
//Design class Person with following fields (id, name, mobile, Job )
//Relation-Person has a job .Write a program to create 2 person objects
// (by constructor).

public class Person {
	public int id;
	public String name;
	public long mobile;
	Job job;
	Person(){
		id=0;
		name="";
		mobile=0;
		job = new Job();
	}
	Person(int id, String name, long mobile, Job job){
		this.id=id;
		this.name=name;
		this.mobile=mobile;
		this.job=job;
	}
	public String toString() {
		return " ID "+id + "\n"+" Name "+name+"\n"+"Moblie no"+mobile+"\n"+" Job "+job;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person(1, "Suraj", 9975924911l, new Job(1,"SWD",45000));
		System.out.println(p1);
	}

}
