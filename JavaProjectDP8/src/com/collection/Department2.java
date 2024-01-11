package com.collection;

public class Department2 {
	int depid;
	String depname,location;
	
	Department2(){
		depid=0;
		depname="";
		location="";
	}
	@Override
	public String toString() {
		return "Department1 [depid=" + depid + ", depname=" + depname + ", location=" + location + "]";
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Department2(String depname, int depid, String location) {
		super();
		this.depid = depid;
		this.depname = depname;
		this.location = location;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
