package com.ops;

public class BirthDate1 {
	int dd,mm,yy;
	public BirthDate1(int i, int j, int k) {
		// TODO Auto-generated constructor stub
		dd=i;
		mm=j;
		yy=k;
	}

	public BirthDate1 getObject()
	{
		return new BirthDate1(18,10,2023);
		//return this;
	}
	public void display()
	{
		System.out.println("Date is = " + dd +"/" + mm + "/" +yy);
	}
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
		BirthDate1 obj3 = new BirthDate1(17,4,2020);
		BirthDate1 o=obj3.getObject();
    	o.display();
		
		
	}
	
}	


