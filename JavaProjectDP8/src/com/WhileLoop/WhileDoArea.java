package com.WhileLoop;
import java.util.Scanner;
public class WhileDoArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc =new Scanner (System.in);
 int l;
 System.out.println("Enter length");
 l=sc.nextInt();
 int b;
 System.out.println("Enter breadth");
 b=sc.nextInt();
 float r;
 System.out.println("Enter radius");
 r=sc.nextInt();
 float pi=3.147f;
 int B;
 System.out.println("Enter base");
 B=sc.nextInt();
 
 int H;
 System.out.println("Enter Height");
 H=sc.nextInt();
 int side;
 System.out.println("Enter side of square");
 side=sc.nextInt();
 char ch;
 do {
	 System.out.println("1.Rect\n2.circle\n3.Triangle\n4.square");
	 System.out.println("Enter the choise from menu");
	 int choise=sc.nextInt();
	 switch (choise)
	 {
	 case 1:System.out.println("Area of reactangle = " + (l*b));
	 break;
	 case 2:System.out.println("Area of circle = " + (pi*r*r));
	 break;
	 case 3:System.out.println("Area of Triangle = " + (0.5*H*B));
	 break;
	 case 4:System.out.println("Area of Square = " + (side*side));
	 break;
	 default:System.out.println("Invalid choise");
	 }
	 System.out.println("Do you want to continue....");
	 ch=sc.next().charAt(0);
 }while (ch=='Y' || ch=='y');
 
	}

}
