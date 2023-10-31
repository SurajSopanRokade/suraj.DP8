package com.ops;

public class DateConst {
   int dd, mm, yy;
   public DateConst()
   {
	   dd=12;
	   mm=2;
	   yy=2023;
   }
   public DateConst(int d, int m, int y)
   {
	   dd=d;
	   mm=m;
	   yy=y;
   }
   public void setData(int d, int m, int y)
   {
	   dd=d;
	   mm=m;
	   yy=y;
   }
   public void display()
   {
	   System.out.println("Date is = "+dd+"/"+mm+"/"+yy);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateConst obj = new DateConst(13,4,2022);
		obj.display();
		obj.setData(12, 3, 1998);
		
	}

}
