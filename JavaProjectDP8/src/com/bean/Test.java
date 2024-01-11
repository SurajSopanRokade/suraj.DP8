package com.bean;
//Create TestResult class to maintain testdate, testid, studid, courseid, marks,outofmarks and 
//add in academy Map<Long, List<TestResult>> where key is course id and value is list of 
//TestResult object.
public class Test {
	MyDate testdate;
	int testid,sid,cid;
	int marks,outofmarks;
	public Test() {
		// TODO Auto-generated constructor stub
	}
	public Test(MyDate testdate, int testid, int sid, int cid, int marks, int outofmarks) {
		super();
		this.testdate = testdate;
		this.testid = testid;
		this.sid = sid;
		this.cid = cid;
		this.marks = marks;
		this.outofmarks = outofmarks;
	}

	public MyDate getTestdate() {
		return testdate;
	}

	public void setTestdate(MyDate testdate) {
		this.testdate = testdate;
	}

	public int getTestid() {
		return testid;
	}

	public void setTestid(int testid) {
		this.testid = testid;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public int getOutofmarks() {
		return outofmarks;
	}

	public void setOutofmarks(int outofmarks) {
		this.outofmarks = outofmarks;
	}

	@Override
	public String toString() {
		return "Test [testdate=" + testdate + ", testid=" + testid + ", sid=" + sid + ", cid=" + cid + ", marks="
				+ marks + ", outofmarks=" + outofmarks + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
