package com.hashmapAssign;

import java.util.Objects;

public class Department {
	int depid;
	String depname;
	String location;
	
	@Override
	public String toString() {
		return "Department [depid=" + depid + ", depname=" + depname + ", location=" + location + "]";
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

	public Department(int depid, String depname, String location) {
		super();
		this.depid = depid;
		this.depname = depname;
		this.location = location;
	}

	public Department() {
		super();
	}
	
	@Override
	public int hashCode() {
		return depid;
	}

	@Override
	public boolean equals(Object obj) {
		Department other = (Department) obj;
		return this.depid == other.depid;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		
	}

}
