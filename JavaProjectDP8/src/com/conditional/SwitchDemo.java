package com.conditional;
import java.util.Scanner;
public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		
		String str="new";
		
		switch(str)
		{
		case "new":System.out.println("New");
		break;
		case "name":System.out.println("Name");
		break;
		case "year":System.out.println("Year");
		break;
		case "happy":System.out.println("Happy");
		break;
		default:System.out.println("Not recognized");
		}

	}

}
