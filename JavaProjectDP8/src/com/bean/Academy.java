package com.bean;

import java.util.ArrayList;
import java.util.HashMap;

//Create Academy class will contains a variable courses List of Course object and 
//enrolledStudents Map<Long, List<Student>> where key is course id and value is list of 
//Student object and Map<Long, List<Attendance>> where key is course id and value is list of
//Attendance object.
public class Academy {
	public static ArrayList<Course> course;
	public HashMap<Long, ArrayList<Student>> slist;
	public HashMap<Long, ArrayList<Attendence>> alist1;
	public HashMap<Long, ArrayList<Transaction>> tlist;
	public HashMap<Long, ArrayList<Test>> telist;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
