package com.Abstraction.copy;

public class Circle extends Shape {
	double r;
	double pi=3.14;
	
	Circle(double r){
		this.r=r;
	}
	
	public double calculateArea() {
		return pi*r*r;
		
	}
	
 
 

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 Circle c1 = new  Circle(3.5);
//		 System.out.println(c1.calculateArea());
		 Shape arr[]= new Shape[4];
		 arr[0]= new Circle(1.2);
		 arr[1]= new Circle(2.4);
		 arr[2]= new Circle(4.5);
		 arr[3]= new Rectangle(12,45);
		 for(int i=0; i<arr.length;i++)
			 System.out.println(arr[i].calculateArea());
		 
		
	}	 
		 
	
	
	

}
