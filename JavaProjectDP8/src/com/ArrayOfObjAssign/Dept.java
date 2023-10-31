package com.ArrayOfObjAssign;
//3.	Create class Dept(did, dname), class MyDate(day, month, year)
//a.	Class Employee(emp_id, emp_name, salary, date(object), dept(object)).
//Create array of Employee and display the array elements.
public class Dept {
	private int did;
	private String dname;
	
	Dept()
	{
		did=0;
		dname="";
	}
	Dept(int did, String dname)
	{
		this.did=did;
		this.dname=dname;
	}
	public void setDid(int did)
	{
		this.did=did;
	}
	public void setDname(String dname)
	{
		this.dname=dname;
	}
	public int getDid()
	{
		return did;
	}
	public boolean checkDept(Dept o)
	{
		if(this.dname==o.dname)
			return true;
		else
			return false;
	}
	public String toString()
	{
		return " Department id " + did +"\n"+ " Department name " + dname;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dept d1 = new Dept();
		System.out.println(d1);
		
		Dept d2 = new Dept(1, "Science");
		System.out.println(d2);
	}

}
