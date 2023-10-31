package com.Abstraction;
//5. WAJP2 create an abstract class Parent. Add an abstract method cook() in it 
//which has only definition and one method wash() which also has 
//implementation. Create class Child which extends Parent and add the missing 
//method implementation. In main, use both the methods by creating instance 
//of the concrete class
//6. Show use of parameterized constructor of parent class (Child class invokes 
//parent’s parameterized constructor) using super
public class Child extends Parent {
	String name;
	Child(){
		System.out.println("I am in default constructor of child");
	}
	Child( int id, String name){
		super(id);
		this.name=name;
		System.out.println(" name " + name +"\n"+ " Id " + id);
		System.out.println("I am in param constructor of child");
	}
	public void cook() {
		System.out.println("I am in cook() of child");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p1 = new Child(1,"Suraj");
		p1.cook();
	}

	

}
