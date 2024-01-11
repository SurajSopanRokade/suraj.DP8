package com.collection;

public class Department {
	int depid;
	String depname="";
	
	Department(){
		depid=0;
		depname="";
	}
	
	@Override
	public String toString() {
		return "Department [depid=" + depid + ", depname=" + depname + "]";
	}

	public int getDepid() {
		return depid;
	}

	public void setDepid(int depid) {
		this.depid = depid;
	}

	public String getDepname() {
		return depname;
	}

	public void setDepname(String depname) {
		this.depname = depname;
	}

	public Department(int depid, String depname) {
		super();
		this.depid = depid;
		this.depname = depname;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
