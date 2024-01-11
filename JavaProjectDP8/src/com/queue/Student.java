package com.queue;

public class Student implements Comparable<Student> {
	int sid;
	String name;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String name) {
		super();
		this.sid = sid;
		this.name = name;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if (this.sid==o.sid)
			return 0;
		else if (this.sid>o.sid)
			return 1;
		else
			return -1;
	}

}
