package com.containment;
//2. WAP to use containment for following hierarchy. Fill all data and print all
//data: (id is a integer number, name is a String)
//Class Institute
//id
//name
//Branch
//id
//name
//Subject
//id
//name
//Topic
//id
//name
//SubTopic
//id
//name
//Question
//id
//name

public class Container1 {
	private int id;
	private String name;
	Branch bran;
	Subject sub;
	Topic top;
	Question que;
		Container1()
		{
			id=0;
			name="";
		}
		Container1(int id, String name, Branch bran, Subject sub, Topic top, Question que  )
		{
			this.id=id;
			this.name=name;
			this.bran=bran;
			this.sub=sub;
			this.top=top;
			this.que=que;
		}
		public void setId(int id)
		{
			this.id= id;
		}
		public void setName(String name)
		{
			this.name=name;
		}
		public int getId()
		{
			return id;
		}
		public String getName()
		{
			return name;
		}
		public String toString()
		{
			return " ID = " + id +"\n"+ " Name = " + name + "\n"+ bran + "\n" + sub + "\n" +top + "\n" +que;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Container1 c1 = new Container1();
		System.out.println(c1);
		
		Branch b1 = new Branch("Science");
		Subject s1 = new Subject("Maths");
		Topic t1 = new Topic("Algorithm");
		Question q1 = new Question("What is 1+2 = ? ");
		Container1 c2 = new Container1(1,"Suraj",b1,s1,t1,q1);
		System.out.println(c2);
	}

}
