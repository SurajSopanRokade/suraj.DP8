package com.Equals;



public class MyDate {
	private int dd, mm, yy;

	MyDate() {
		dd = 12;
		mm = 3;
		yy = 2023;
	}

	MyDate(int dd, int mm, int yy) {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	public void setDd(int dd) {
		this.dd = dd;
	}

	public void setMm(int mm) {
		this.mm = mm;
	}

	public void setYy(int yy) {
		this.yy = yy;
	}

	public int getDd() {
		return dd;
	}

	public int getMm() {
		return mm;
	}

	public int getYy() {
		return yy;
	}

	public String toString() {
		return dd + "/" + mm + "/" + yy;
	}
	public boolean equals(Object obj) {
		//Object obj = new MyDate();
		 System.out.println("In equals");
    	 MyDate d=(MyDate)obj;
    	 if(this.dd==d.dd && this.mm==d.mm && this.yy==d.yy)
    		 return true;
    	 else
    		 return false;
	}
	public int hashcode() {
		int prime=31;
		int result=1;
		result=prime*result+dd;
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate d1 = new MyDate(12,3,2023);
		//System.out.println(d1.hashcode());
//		MyDate d2=d1;
		
		MyDate d2 = new MyDate(12, 3, 2023);
//		System.out.println(d2);
		System.out.println(d1.hashcode());
		System.out.println(d1.equals(d2));
	}

}

	
