package com.test6;


import java.util.Comparator;

public class CompShipment implements Comparator<Shipment>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
	}

	@Override
	public int compare(Shipment o1, Shipment o2) {
		// TODO Auto-generated method stub
//		if (o1.getAddr().city==o2.getAddr().city) {
//			if(o1.date.dd==o2.date.dd)
//				return 0;
//			else if(o1.date.dd>o2.date.dd)
//				return 1;
//			else
//				return -1;
//		}
//		else
//			return o1.getAddr().city.compareTo(o2.getAddr().city);
		MyDate m1 = o1.getDate();
		MyDate m2 = o2.getDate();
		
		if (o1.getAddr().city.equals(o2.getAddr().city)){
			return m1.compareTo(m2);
		}
		else 
			return o1.getAddr().city.compareTo(o2.getAddr().city);
				
		
	}

}
