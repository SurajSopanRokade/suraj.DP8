package com.test7;
//Q8>There is a HashSet which has student objects. 
//Create two ArrayLists from this HashSet. 
//WAP to iterate and remove all the students 
//in HashSet such that in one ArrayList called “placed” Students insert
//students who have been placed and in another ArrayList add un-“placed” Students.
//In the end, the HashSet should contain nothing. 
//Student class fields: (id, name, degree, passingYear, placed (true/false) ). 
public class Student {
	int sid;
	String sname,degree,passingyear;
	boolean placed;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String sname, String degree, String passingyear, boolean placed) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.degree = degree;
		this.passingyear = passingyear;
		this.placed = placed;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getPassingyear() {
		return passingyear;
	}

	public void setPassingyear(String passingyear) {
		this.passingyear = passingyear;
	}

	public boolean isPlaced() {
		return placed;
	}

	public void setPlaced(boolean placed) {
		this.placed = placed;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", degree=" + degree + ", passingyear=" + passingyear
				+ ", placed=" + placed + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
