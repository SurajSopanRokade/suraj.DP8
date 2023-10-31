package com.Array;

public class Student {
	private int rollnum;
	private String name;
	private int percent;
	private String Grade;
	private int marks[];

	Student(int rollnum, String name, int a[]) {
		marks = new int[6];
		this.rollnum = rollnum;
		this.name = name;
		marks = a;

	}

	public int percent() {
		int sum = 0;
		int count = 0;
		for (int i : marks) {
			count++;
			sum = sum + i;
		}
		percent = sum / count;
		return percent;
	}

	public String grade() {
		if (percent > 80)
			Grade = "A";
		else if (percent > 70)
			Grade = "B";
		else if (percent > 60)
			Grade = "c";
		else if (percent > 50)
			Grade = "D";
		return Grade;
	}

	public String toString() {
		return (" Roll num " + rollnum +"\n"+ " name " + name + "\n" + " percentage " + percent + 
				"\n" + " Grade " + Grade);
        
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s1Arr[] = { 80, 80, 60, 70, 70, 70 };
		Student s1 = new Student(1, "Suraj", s1Arr);
		s1.percent();
		s1.grade();
		System.out.println(s1);
		System.out.println();

		int s2Arr[] = { 60, 60, 60, 64, 60, 80 };
		Student s2 = new Student(2, "Abhi", s2Arr);
		s2.percent();
		s2.grade();
		System.out.println(s2);
	}

}
