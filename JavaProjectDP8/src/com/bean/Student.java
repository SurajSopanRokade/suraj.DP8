package com.bean;

public class Student {
	private int sid;
	private long phno;
	private String sname, email;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int sid, long phno, String sname, String email) {
		super();
		this.sid = sid;
		this.phno = phno;
		this.sname = sname;
		this.email = email;
	}



	public int getSid() {
		return sid;
	}



	public void setSid(int sid) {
		this.sid = sid;
	}



	

	public long getPhno() {
		return phno;
	}



	public void setPhno(long phno) {
		this.phno = phno;
	}



	public String getSname() {
		return sname;
	}



	public void setSname(String sname) {
		this.sname = sname;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public String toString() {
		return "Student [sid=" + sid + " phno=" + phno + ", sname=" + sname + ", email=" + email
				+ "]";
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
