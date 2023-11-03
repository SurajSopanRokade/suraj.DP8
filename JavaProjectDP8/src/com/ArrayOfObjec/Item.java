package com.ArrayOfObjec;
//Item class contains itemId,ItemName,itemCost.
//1.Create Array of Item with size 5 and display it.     
//2. Show itemNames with cost more than Rs.2000      
//3. Show item details with higest price.      
//4. Show average price of all items.       
//5. Increase the itemPrice by 200 whose itemPrice is below Rs.1000
public class Item {
	int itemid, itemcost;
	String itemname;
	
	Item(){
		itemid=0;
		itemcost=0;
		itemname="";
	}
	Item(int itemid, int itemcost, String itemname){
		this.itemid=itemid;
		this.itemcost=itemcost;
		this.itemname=itemname;
	}
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public int getItemcost() {
		return itemcost;
	}
	public void setItemcost(int itemcost) {
		this.itemcost = itemcost;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public static void increasePricebelow1000(Item n[]) {
		for (int i=0; i<n.length; i++) {
			if(n[i].itemcost<1000) {
				n[i].itemcost=n[i].itemcost+200;
				System.out.println(" Increase the itemPrice by 200 "+n[i]);
			}
			
			System.out.println("____________________________________________________________________________");
		}
	}
	public static void printItemhigh2000(Item n[]) {
		for (int i=0; i<n.length; i++) {
			if(n[i].itemcost>2000) {
				System.out.println(" Items with high cost than 2000 "+n[i]);
			}
		}
		System.out.println("____________________________________________________");
	}
	public static void printHighestPrice(Item n[]) {
		int ele=n[0].itemcost;
		for (int i=1; i<n.length; i++) {
			if(n[i].itemcost>ele) {
				ele=n[i].itemcost;
			}
				
		}
		System.out.println(" Highest price Item "+ele );
		System.out.println("______________________________________________________");
	}
	public static void averagePrice(Item n[]) {
		int sum=0;
		for (int i=0; i<n.length; i++) {
			sum=sum+n[i].itemcost;
		}
		System.out.println(" Average of all item price " + sum/n.length);
	}
	public String toString() {
		return "\n"+" Itemid "+itemid+"\n"+" Itemcost " + itemcost+"\n"+" Itemname " +itemname;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item arr[]= new Item[5];
		arr[0]= new Item(1,3400,"watch");
		arr[1]= new Item(2,2400,"pen");
		arr[2]= new Item(3,400,"pencil");
		arr[3]= new Item(4,300,"tea");
		arr[4]= new Item(1,700,"Maggie");
		
		
		printItemhigh2000(arr);
		printHighestPrice(arr);
		averagePrice(arr);
		increasePricebelow1000(arr);
	}
	
}
