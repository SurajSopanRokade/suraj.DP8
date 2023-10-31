package com.containment;

public class Question {
private String que;
	
    Question()
	{
    	que="";
	}
    Question(String que)
	{
		this.que=que;
	}
	public void setQue(String que)
	{
		this.que=que;
	}
	public String getQue()
	{
		return que;
	}
	public String toString()
	{
		return " Question is = " + que;
	}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Question q1 = new Question ();
	System.out.println(q1);
	
	Question q2 = new Question ("What is answer of 1+2");
	System.out.println(q2);
}

}

	