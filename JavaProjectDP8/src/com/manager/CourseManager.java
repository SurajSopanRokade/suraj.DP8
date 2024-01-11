package com.manager;

import java.util.ArrayList;
import java.util.Arrays;

import com.bean.Academy;
import com.bean.Course;
import com.bean.MyDate;

public class CourseManager {
	public static void addCourse() {
	Course c1 = new Course (1,"Java",new MyDate(12,2,2023),45000,23,"xyz");
	Course c2 = new Course (2,"Python",new MyDate(14,2,2023),35000,22,"ryz");
	Course c3 = new Course (3,"C++",new MyDate(16,2,2023),4000,26,"iyz");
	Course c4 = new Course (4,".net",new MyDate(17,2,2023),5000,28,"oyz");
	Academy.course.add(c1);
	Academy.course.add(c2);
	Academy.course.add(c3);
	Academy.course.add(c4);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
