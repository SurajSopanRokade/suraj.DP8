package com.exception;

public class InsufficientBalanceException extends Exception {
	int amt;
	InsufficientBalanceException(){
		
	}
	InsufficientBalanceException(int amt){
		this.amt=amt;
	}
	
	public String toString() {
		return "InsufficientBalanceException [amt=" + amt + "]";
	}
	

}
