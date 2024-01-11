package com.bean;
//Create Attendance class with fields of your choice where you have to track attendance of 
//each student every day.
public class Attendence {
	int serialno;
	int sid;
	String status;
	MyDate date;
	
	public Attendence() {
		// TODO Auto-generated constructor stub
	}
	public Attendence(int serialno, int sid, String status, MyDate date) {
		super();
		this.serialno = serialno;
		this.sid = sid;
		this.status = status;
		this.date = date;
	}

	public int getSerialno() {
		return serialno;
	}

	public void setSerialno(int serialno) {
		this.serialno = serialno;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public MyDate getDate() {
		return date;
	}

	public void setDate(MyDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Attendence [serialno=" + serialno + ", sid=" + sid + ", status=" + status + ", date=" + date + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
