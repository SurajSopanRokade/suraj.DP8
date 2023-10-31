package com.ops;

public class ThisConcept {
	int dd, mm, yy;
	public ThisConcept(int dd, int mm, int yy)
	{
		dd=this.dd;
		this.mm=mm;
		this.yy=yy;
	}
	public void display ()
	{
		System.out.println("Date is = "+dd+"/"+mm+"/"+yy);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisConcept obj = new ThisConcept(2,5,2023);
		obj.display();
	}

}
