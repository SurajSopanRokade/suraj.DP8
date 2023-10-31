package com.containment;

//4. Create Employee class which has attributes (id, name, salary, dept,
//mydate). Where dept and mydate is class, dept has (dept_id, dept_name)
//And mydate has (day, month, year).
//Display Employee information.
//Note. Containment using constructor and getter/setter
public class MyDate {
	private int dd, mm, yy;

	MyDate() {
		dd = 0;
		mm = 0;
		yy = 0;
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate d1 = new MyDate();
		System.out.println(d1);

		MyDate d2 = new MyDate(2, 4, 2029);
		System.out.println(d2);
	}

}
