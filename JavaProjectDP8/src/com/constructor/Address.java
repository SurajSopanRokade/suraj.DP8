package com.constructor;
//3. Create class Person which has attributes (name, gender, age, Address).
//Address is class which has attributes (city, state, country). Display Persons
//data
//Note. Containment using constructor and getter/setter

public class Address {
	private String city, state, country;
	
	Address()
	{
		city="";
		state="";
		country="";
	}
	Address(String city, String state, String country)
	{
		this.city=city;
		this.state=state;
		this.country=country;
	}
	public void setCity(String city)
	{
		this.city=city;
	}
	public void setState(String state)
	{
		this.state=state;
	}
	public void setCountry(String country)
	{
		this.country=country;
	}
	public String getCity()
	{
		return city;
	}
	public String getState()
	{
		return state;
	}
	public String getCountry()
	{
		return country;
	}
	public String toString()
	{
		return " City "+city+" State "+state+" Country "+country;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Address a1 = new Address();
			System.out.println(a1);
			
			Address a2 = new Address("Pune", "Maharastra", "India");
			System.out.println(a2);
	}

}
