package com.Abstraction;
//5. WAJP2 create an abstract class Parent. Add an abstract method cook() in it 
//which has only definition and one method wash() which also has 
//implementation. Create class Child which extends Parent and add the missing 
//method implementation. In main, use both the methods by creating instance 
//of the concrete class
public abstract class Parent {
	int id;
	Parent(){
		id=0;
		System.out.println("I am in default constructor of parent");
	}
	Parent(int id){
		this.id = id;
		System.out.println("I am in paramatrised constructor of parent");
	}
	public abstract void cook();
	public void wash() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
