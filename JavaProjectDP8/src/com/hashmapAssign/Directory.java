package com.hashmapAssign;

import java.util.ArrayList;

//WAP Phone Directory application in java using a Map.
//The phone directory should allow users to:
//
//Add a contact with a name and phone number.
//Remove a contact by name.
//Retrieve the phone number associated with a given name.
//Display the entire phone directory.
public class Directory {
	String name;
	ArrayList<Long>phoneno;
	
	public Directory() {
		// TODO Auto-generated constructor stub
	}
	
	public Directory(String name, ArrayList<Long> phoneno) {
		super();
		this.name = name;
		this.phoneno = phoneno;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Long> getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(ArrayList<Long> phoneno) {
		this.phoneno = phoneno;
	}
	
	@Override
	public String toString() {
		return "Directory [name=" + name + ", phoneno=" + phoneno + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
