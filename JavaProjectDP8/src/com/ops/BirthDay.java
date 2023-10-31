package com.ops;

public class BirthDay {
	int dd,mm,yy;
	public void add(int d, int m, int y)
	{
		dd=d;
		mm=m;
		yy=y;
	}
	public void sum(BirthDay pobj, BirthDay nobj )
	{
		
		dd=nobj.dd+pobj.dd;
		mm=nobj.mm+pobj.mm;
		yy=nobj.yy+pobj.yy;
		//System.out.println("pobj = "+pobj);
		System.out.print("Date is = " + dd+"/"+mm+"/"+yy);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BirthDay obj = new BirthDay();
		BirthDay obj1 = new BirthDay();
		BirthDay obj2 = new BirthDay();
//		
    	obj.add(2,3,2023);
		obj1.add(1,2,2024);
		obj2.sum(obj,obj1);
		
		
	}
	
	

}
