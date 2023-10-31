package com.containment;

public class Topic {
private String top;
	
    Topic()
	{
    	top="";
	}
    Topic(String top)
	{
		this.top=top;
	}
	public void setTop(String top)
	{
		this.top=top;
	}
	public String getTop()
	{
		return top;
	}
	public String toString()
	{
		return " Name of Topic is = " + top;
	}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Topic t1 = new Topic ();
	System.out.println(t1);
	
	Topic t2 = new Topic ("Algorithm");
	System.out.println(t2);
}

}
