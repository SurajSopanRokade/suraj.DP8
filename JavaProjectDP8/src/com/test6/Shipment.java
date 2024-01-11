package com.test6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Shipment  {
	int shipid;
	String cname;
	Address addr;
	MyDate date;
	public Shipment() {
		// TODO Auto-generated constructor stub
	}
	
	public Shipment(int shipid, String cname, Address addr, MyDate date) {
		super();
		this.shipid = shipid;
		this.cname = cname;
		this.addr = addr;
		this.date = date;
	}
	
	public int getShipid() {
		return shipid;
	}

	public void setShipid(int shipid) {
		this.shipid = shipid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	public MyDate getDate() {
		return date;
	}

	public void setDate(MyDate date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "Shipment [shipid=" + shipid + ", cname=" + cname + ", addr=" + addr + ", date=" + date + "]\n";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shipment s1 = new Shipment(1,"Suraj",new Address("hroad", "pune","maha"),new MyDate(12,3,1998));
		Shipment s2 = new Shipment(2,"Abhi",new Address("troad", "pune","guj"),new MyDate(23,6,1998));
		Shipment s3 = new Shipment(3,"Yogesh",new Address("mroad", "pandharpur","raj"),new MyDate(45,3,1998));
		Shipment s4 = new Shipment(4,"Maruti",new Address("ctroad", "nashik","up"),new MyDate(17,7,1998));
		
		ArrayList<Shipment>list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		CompShipment c1 = new CompShipment();
		Collections.sort(list, c1);
		Iterator<Shipment> itr = list.iterator();
		while(itr.hasNext()) {
			Shipment si=itr.next();
			System.out.println("Ship id : "+si.shipid+" Customer name : " + si.cname);
			Address ad=si.addr;
			System.out.println("Address : " + ad.addr+","+" City : " + ad.city+","+" State : "+ad.state);
			MyDate dat = si.date;
			System.out.println("Date of Shipment : "+dat.dd+"/"+dat.mm+"/"+dat.yy);
			System.out.println("**********************************************************************************************************");
		}
	}

	

}
