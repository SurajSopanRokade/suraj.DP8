package com.bean;

import java.util.ArrayList;

//Create a class Course which contains cid, cname , startDate (Date object) subject , fees, 
//duration . For this class you can have public fields as well. [NOTE: one student can be in 
//one course only]
public class Course {
	int cid;
	String cname;
	MyDate date;
	int fees;
	int duration;
	String subject;
	public Course() {
		// TODO Auto-generated constructor stub
	}
	public Course(int cid, String cname, MyDate date, int fees, int duration, String subject) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.date = date;
		this.fees = fees;
		this.duration = duration;
		this.subject = subject;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public MyDate getDate() {
		return date;
	}

	public void setDate(MyDate date) {
		this.date = date;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", date=" + date + ", fees=" + fees + ", duration="
				+ duration + ", subject=" + subject + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
