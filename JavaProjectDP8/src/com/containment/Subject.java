package com.containment;

public class Subject {
	private String sub;
	
	Subject()
	{
		sub="";
	}
	Subject(String sub)
	{
		this.sub=sub;
	}
	public void setSub(String sub)
	{
		this.sub=sub;
	}
	public String getSub()
	{
		return sub;
	}
	public String toString()
	{
		return " Name of Subject is = " + sub;
	}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Subject s1 = new Subject ();
	System.out.println(s1);
	
	Subject s2 = new Subject ("Maths");
	System.out.println(s2);
}

}
	