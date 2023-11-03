package com.ArrayOfObjec;

import java.util.Arrays;

//Array Of Objects Extra Assignment : 
//Supplier class Contains supid,supName and array of itemsSUpplied.    
//Item class contains itemId,ItemName,itemCost.      
//1Create 2 Item type arrays with size 5 and associate them with two Supplier objects.   
//2. Show item details supplied by each supplier.

public class Supplier {
	int supid;
	String supName;
	Item Item[];
	Supplier(){
		supid=0;
		supName="";
		
	}
	Supplier(int supid, String supName, Item Item []){
		this.supid=supid;
		this.supName=supName;
		this.Item=Item;
	}
	public String toString() {
		return "Supplier id "+ supid +"\n" + " Supplier name " + supName +"\n" + " Items supplied " + Arrays.toString(Item);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item arr[]= new Item[5];
		arr[0]= new Item(1,3400,"watch");
		arr[1]= new Item(2,2400,"pen");
		arr[2]= new Item(3,400,"pencil");
		arr[3]= new Item(4,300,"tea");
		arr[4]= new Item(1,700,"Maggie");
		
		Supplier s1 = new Supplier(1, "Suraj", arr );
		System.out.println(s1);
		System.out.println("________________________________________________");
		
	}

}
