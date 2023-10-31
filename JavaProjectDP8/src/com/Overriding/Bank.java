package com.Overriding;
//6) A bank has a principal amount and a rate of interest which is 2%.
//A savings account has a rate of interest 3% while a current account has 5%. 
//Write a method that displays the rate of interest based on whether the account is default/ savings/ current.
public class Bank {
	double principleAmount;
	String rate;
	
	Bank(){
		principleAmount=0;
		rate="";
	}
	Bank(double principleAmount, String rate){
		this.principleAmount=principleAmount;
		this.rate=rate;
	}
	public void display() {
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank  b1 = new Bank ();
		System.out.println(b1);
	}

}
