package com.ops;

public class BirthDate {
	long dd;
	long mm;
	long yy;
	static long ddd;
	static long yyy;
	static long mmm;

	public void setData(long dd, long mm, long yy) {
		dd = dd;
		mm = mm;
		yy = yy;
		System.out.println("dd = "+dd);
	}
	public void another()
	{
		ddd=dd;
		mmm=mm;
		yyy=yy;
	}

	public static void display() {
		System.out.println("Date is " + ddd + "/" + mmm + "/" + yyy);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BirthDate obj3 = new BirthDate();
		new BirthDate();
		obj3.setData(2, 4, 2023);
//		obj3.another();
//		obj3.display();
		display();
	}

}
