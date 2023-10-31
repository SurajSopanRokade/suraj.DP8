package com.ops;

public class DateBirth {
	
		private int dd, mm, yy;
		
	public void setDd(int d)
	{
		dd=d;
	}
	public void setMm(int m)
	{
		mm=m;
	}
	public void setYy(int y)
	{
		yy=y;
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
	public void setData(int d, int m, int y )
	{
		dd=d;
		mm=m;
		yy=y;
	}
	public void display()
	{
		System.out.println("Birth date is "+dd+"/"+mm+"/"+yy);
	}
	

		
		

		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateBirth obj = new DateBirth();
		obj.setDd(12);
		obj.setMm(6);
		obj.setYy(2023);
		obj.display();
		obj.setData(10, 5, 2023);
		obj.display();
		
	}
	 {
		// TODO Auto-generated method stub
		
	}

}
