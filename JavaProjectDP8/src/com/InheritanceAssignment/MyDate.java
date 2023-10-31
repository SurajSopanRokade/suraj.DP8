package com.InheritanceAssignment;



public class MyDate {
private int dd, mm, yy;
	
	MyDate()
	{
		dd=0;
		mm=0;
		yy=0;
	}
	MyDate(int dd, int mm, int yy )
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
		
	}
	public void setDd(int dd)
	{
		this.dd=dd;
	}
	public void setMm(int mm)
	{
		this.mm=mm;
	}
	public void setYy(int yy)
	{
		this.yy=yy;
	}
	public int getDd()
	{
		return dd;
	}
	public int getMm()
	{
		return mm;
	}
	public int getYy()
	{
		return yy;
	}
	public String toString()
	{
		return dd+"/"+mm+"/"+yy;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate m1 = new MyDate();
		System.out.println(m1);
		
		MyDate m2 = new MyDate(12,3,2023);
		System.out.println(m2);
	}

}
	

	