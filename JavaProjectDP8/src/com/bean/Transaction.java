package com.bean;
//Create Transaction class to maintain paidfees of students for each transaction. Eg out of 
//10thousand first time student A paid 5000rs and again 5000rs. Add Map<Long, 
//List<Transaction>> where key is course id and value is list of Transaction object.
public class Transaction {
	int sid;
	MyDate tdate;
	int paidfees;
	public Transaction() {
		// TODO Auto-generated constructor stub
	}
	public Transaction(int sid, MyDate tdate, int paidfees) {
		super();
		this.sid = sid;
		this.tdate = tdate;
		this.paidfees = paidfees;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public MyDate getTdate() {
		return tdate;
	}

	public void setTdate(MyDate tdate) {
		this.tdate = tdate;
	}

	public int getPaidfees() {
		return paidfees;
	}

	public void setPaidfees(int paidfees) {
		this.paidfees = paidfees;
	}

	@Override
	public String toString() {
		return "Transaction [sid=" + sid + ", tdate=" + tdate + ", paidfees=" + paidfees + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
