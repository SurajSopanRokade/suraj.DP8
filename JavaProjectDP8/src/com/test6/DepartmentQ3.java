package com.test6;

public class DepartmentQ3 {
	int id;
	String name,location;
	
	public DepartmentQ3() {
		// TODO Auto-generated constructor stub
	}
	
	public DepartmentQ3(int id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	@Override
	public String toString() {
		return "DepartmentQ3 [id=" + id + ", name=" + name + ", location=" + location + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
