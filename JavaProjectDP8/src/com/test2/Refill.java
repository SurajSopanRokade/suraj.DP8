package com.test2;
//3. A Pen contains variables Refill, capLength and brand. 
//Refill has variables inkColor, length and Nib (tip).
//Nib has variables materialType and width. 
//Create a Java class structure for above . 
//Write a main method which sets values in all the variables
//using setter methods and prints all the variables using getter methods. [2M]
public class Refill {
	public String inkColor;
	public int length;
	Nib nib;
	Refill(){
		inkColor="";
		length=0;
	}
	public String getInkColor() {
		return inkColor;
	}
	public void setInkColor(String inkColor) {
		this.inkColor = inkColor;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public Nib getNib() {
		return nib;
	}
	public void setNib(Nib nib) {
		this.nib = nib;
	}
	Refill( int length, String inkColor, Nib nib  ){
		this.inkColor=inkColor;
		this.length=length;
		this.nib=nib;
	}
	public void setData(int length, String inkColor, Nib nib ) {
		this.inkColor=inkColor;
		this.length=length;
		this.nib=nib;
	}
	public String toString() {
		return " length " + length +" inkColor "+ inkColor + "\n" + " Nib " + nib;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
