package com.Abstraction.copy;
//2. Above we created an abstract class Machine with an abstract method crush
//and a concrete / implemented method rotate. Now create another abstract 
//class Mixer which extends the abstract class Machine, has method crush 
//implemented and has an additional concrete method blend. In main create an 
//object of class of Mixer. Call methods rotate, blend and crush.
public class Mixer extends Machine2 {
	
	public void crush() {
		System.out.println("I am in crush() of Mixer");
		
	}
	public void blend() {
		System.out.println("I am in blend() of Mixer");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mixer m1 = new Mixer();
		m1.rotate();
		m1.blend();
		m1.crush();
	}

	

}
