package com.containment;

public class Branch {
	private String nameb;
	
		Branch()
		{
			nameb="";
		}
		Branch(String nameb)
		{
			this.nameb=nameb;
		}
		public void setName(String nameb)
		{
			this.nameb=nameb;
		}
		public String getNameb()
		{
			return nameb;
		}
		public String toString()
		{
			return " Name of Branch is " + nameb;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Branch b1 = new Branch ();
		System.out.println(b1);
		
		Branch b2 = new Branch ("Science");
		System.out.println(b2);
	}

}
