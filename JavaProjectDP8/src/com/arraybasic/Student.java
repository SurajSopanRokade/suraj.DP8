package com.arraybasic;

import java.util.Scanner;

//Total, percent, Grade
public class Student {
	public static int total(int n[]) {
		int total=0;
		for (int i=0; i<n.length; i++) {
			total=total+n[i];
		}
		
		return total/n.length;
		
	}
	public static void percentGrade(int percent) {
		if (percent >90)
			System.out.println("Grade A");
		else if (percent >80)
			System.out.println("Grade B");
		else if (percent >70)
			System.out.println("Grade c");
		else if (percent >60)
			System.out.println("Grade D");
	}
	public static int [] createArray() {
		int num[];
		System.out.println("Enter size of Array");
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		num = new int [size];
		for (int i=0; i<num.length; i++) {
			System.out.println("Enter array " + (i+1)+ " Elements ");
			num[i]=sc.nextInt();
			
		}
		sc.close();
		return num;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k[]=createArray();
		System.out.println("Percent "+total(k));
		int perc=total(k);
		percentGrade(perc);
		
	}

}
