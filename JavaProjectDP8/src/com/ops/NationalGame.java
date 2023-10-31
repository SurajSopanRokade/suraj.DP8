package com.ops;
import java.util.Scanner;
public class NationalGame {
	String countryname;
	public void setData(String a)
	{
		countryname=a;
	}
	public void sport()
	{
		switch(countryname)
		{
		  case "India": System.out.println("National sport is Hockey");
		  break;
		  case "China": System.out.println("National sport is Table Tennis");
		  break;
		  case "Bangladesh": System.out.println("National sport is Kabaddi");
		  break;
		  case "Italy": System.out.println("National sport is Football");
		  break;
		  case "United states": System.out.println("National sport is Baseball");
		  break;
		  default:System.out.println("Nation out of range");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String country;
		System.out.println("Enter country name");
		country=sc.next();
		NationalGame obj = new NationalGame();
		obj.setData(country);
		obj.sport();
		
	}

}
