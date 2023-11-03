package com.ArrayOfObject;

public class Student1 {
	int rollNo;
	String name;
	double percent;
	Student1 marks[];
	Student1(){
		rollNo=0;
		name="";
	}
	Student1(int rollNo, String name, double percent){
		this.rollNo=rollNo;
		this.name=name;
		this.percent=percent;
	}
	public static double calculatePer(double n[]) {
		double sum=0;
		
		for (int i=0; i<n.length; i++) {
			sum=sum+n[i];
		}
		return sum/n.length;
	}
	public static void maxPercentage(Student1 n[]) {
		Student1 t[]= new Student1[1];
		
		double ele1=n[0].percent;
		    t[0]=n[0];
		for (int i=1; i<n.length; i++) {
			if (ele1<n[i].percent) {
				ele1=n[i].percent;
				t[0]=n[i];
			}
		}
		System.out.println(" Max percentage " + ele1 +"\n"+ t[0]);
	}
	public String toString() {
		return "\n"+" RollNum "+ rollNo + "\n" + " Name " + name +"\n"+ " Percent " + percent;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double arrMarksS1 [] = {78,89,79,89,78};
		double arrMarksS2 [] = {93,92,91,95,73};
		double arrMarksS3 [] = {76,99,99,69,88};
		
		Student1 arr[] = new Student1[3];
		arr[0] = new Student1 (1, "Suraj", calculatePer(arrMarksS1));
		arr[1] = new Student1 (2, "Su", calculatePer(arrMarksS2));
		arr[2] = new Student1 (3, "raj", calculatePer(arrMarksS3));
		
		maxPercentage(arr);
	}

}
