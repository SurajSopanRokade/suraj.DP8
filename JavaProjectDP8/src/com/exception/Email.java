package com.exception;

import java.util.Scanner;

//Custom Email Validation Exception
//As part of the registration process, users need to provide an email address. 
//Your task is to create a custom exception for email validation.
//
//Write a Java program that includes the following classes:
//
//EmailValidationException Class:
//
//Create a custom exception class named EmailValidationException that extends the Exception 
//class.
//This exception should be thrown whenever an invalid email address is detected 
//during the registration process.
//
//UserRegistration Class:
//
//Include a method named registerUser that takes an email address as a parameter 
//and performs the following validations:
//The email address must not be null.
//The email address must contain the "@" symbol.
//The email address must have a valid domain (for simplicity,
// you can check if the domain contains a dot "." character).
//
//Main Class:
//
//In the main method, create an instance of UserRegistration.
//Demonstrate the registration process by calling the registerUser method with various email addresses, 
//including both valid and invalid ones.
//Catch the custom exception (EmailValidationException) and handle it appropriately by displaying
// a user-friendly error message.
public class Email {
	public void registerUser(String n) {
		if (n.contains(".")==false)
			System.out.println();
		
	}
	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			String str=sc.next();
			Email e1 = new Email();
			e1.registerUser(str);
		}
	}

}
