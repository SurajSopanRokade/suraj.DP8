package com.test6;

public class MyDate implements Comparable<MyDate> {
	int dd,mm,yy;
	public MyDate() {
		// TODO Auto-generated constructor stub
	}
	
	public MyDate(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
	public int getDd() {
		return dd;
	}

	public void setDd(int dd) {
		this.dd = dd;
	}

	public int getMm() {
		return mm;
	}

	public void setMm(int mm) {
		this.mm = mm;
	}

	public int getYy() {
		return yy;
	}

	public void setYy(int yy) {
		this.yy = yy;
	}
	
	@Override
	public String toString() {
		return "MyDate [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compareTo(MyDate o) {
		// TODO Auto-generated method stub
		Integer d1=this.dd;
		Integer d2=o.dd;
		
		Integer m1=this.mm;
		Integer m2=o.mm;
		
		Integer y1=this.yy;
		Integer y2=o.yy;
		
		if (this.yy==o.yy) {
			if(this.mm==o.mm)
				return d1.compareTo(d2);
			else 
				return m1.compareTo(m2);
		}
		else
			return y1.compareTo(y2);
	}

	
	

}
