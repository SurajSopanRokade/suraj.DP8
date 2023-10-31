package com.ArrayOfObject;
//2.  WAP to print the employees from Employee[] array who has same joining date.
//You have Employee class which has 4 attributes id, name, salary, date 
//(date is another object which has 3 attributes day, month, year) 
//and add employee objects to your array
public class DateOfJoining2 {
	private int dd, mm, yy;
	
	DateOfJoining2()
	{
		dd=0;
		mm=0;
		yy=0;
	}
	DateOfJoining2(int dd, int mm, int yy )
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
	public boolean compareDate(DateOfJoining2 o)
	{
		if (this.dd==o.dd && this.mm==o.mm && this.yy==o.yy)
			return true;
		else
			return false;
	}
	public String toString()
	{
		return dd+"/"+mm+"/"+yy;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateOfJoining2 d1 = new DateOfJoining2();
		System.out.println(d1);
		
		DateOfJoining2 d2 = new DateOfJoining2(12,3,2023);
		System.out.println(d2);
	}

}
