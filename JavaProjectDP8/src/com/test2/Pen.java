package com.test2;
//3. A Pen contains variables Refill, capLength and brand. 
//Refill has variables inkColor, length and Nib (tip).
// Nib has variables materialType and width. 
//Create a Java class structure for above . 
//Write a main method which sets values in all the variables
//using setter methods and prints all the variables using getter methods. [2M]

public class Pen {
	public int caplength;
	public String brand;
	Refill refill;
	Pen(){
		caplength=0;
		brand="";
		
	}
	Pen(int caplength, String brand, Refill refill){
		this.caplength=caplength;
		this.brand=brand;
		this.refill=refill;
	}
	public void SetData(int caplength, String brand, Refill refill) {
		this.caplength=caplength;
		this.brand=brand;
		this.refill=refill;
	}
	public String toString() {
		return " caplength "+caplength +"\n"+" brand "+brand+"\n"+ " Refill " + refill;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pen p1 = new Pen();
		p1.SetData(4, "Champ", new Refill(12, "Blue", new Nib("Plastic", 6)));
		System.out.println(p1);
	}

}
