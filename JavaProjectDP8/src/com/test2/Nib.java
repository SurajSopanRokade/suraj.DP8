package com.test2;
//3. A Pen contains variables Refill, capLength and brand. 
//Refill has variables inkColor, length and Nib (tip).
//Nib has variables materialType and width. 
//Create a Java class structure for above . 
//Write a main method which sets values in all the variables
//using setter methods and prints all the variables using getter methods. [2M]
public class Nib {
	public String materialType;
	public int width;
	
	Nib(){
		materialType="";
		width=0;
	}
	Nib(String materialType,int width){
		this.materialType=materialType;
		this.width=width;
	}
	public void setData(String materialType,int width) {
		this.materialType=materialType;
		this.width=width;
	}
	public String toString() {
		return " materialType "+materialType+"\n"+" width " + width;
	}
	public String getMaterialType() {
		return materialType;
	}
	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
