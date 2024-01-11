package com.test7;
//10> Create a PriorityQueue to give engineering admission to candidate.
//Create Candidate class with cid,cname,m1,m2,m3,percentage.
//Candidate with highest marks should get admission first! 
public class Candidate implements Comparable<Candidate>{
	int cid,m1,m2,m3;
	String cname;
	double percent;
	public Candidate() {
		// TODO Auto-generated constructor stub
	}
	public Candidate(int cid, int m1, int m2, int m3, String cname) {
		super();
		this.cid = cid;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.cname = cname;
		this.percent=calculatePerc();
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public int getM1() {
		return m1;
	}

	public void setM1(int m1) {
		this.m1 = m1;
	}

	public int getM2() {
		return m2;
	}

	public void setM2(int m2) {
		this.m2 = m2;
	}

	public int getM3() {
		return m3;
	}

	public void setM3(int m3) {
		this.m3 = m3;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}
	public double calculatePerc() {
		return percent=(m1+m2+m3)/3;
	}
	@Override
	public String toString() {
		return "Candidate [cid=" + cid + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + ", cname=" + cname + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Override
	public int compareTo(Candidate o) {
		// TODO Auto-generated method stub
		if(this.percent==o.percent)
			return 0;
		else if(this.percent>o.percent)
			return -1;
		else
			return 1;
	}

}
