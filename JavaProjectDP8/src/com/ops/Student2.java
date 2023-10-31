package com.ops;

public class Student2 {
	
		  int Rollnum, physics, maths, biology, geography, history;
		  String name,emailId;
		  long contact;
		  double percentage;
		  char grade;
		  
		  public void setData(int Roll, String N, String email, long cont, int phy, int math, int bio, int geo, int hist)
		  {
			  Rollnum = Roll;
			  name = N;
			  emailId = email;
			  contact = cont;
			  physics = phy;
			  maths = math;
			  biology = bio;
			  geography = geo;
			  history = hist;
		  }
		 
		  
			  public void percentage()
			  {
			  percentage = (physics + maths + biology + geography + history)*100/500;
			  }
			  public void grade()
			  {
			  if (percentage >= 90)
				  grade = 'A';
			  else if (percentage >= 80)
				  grade = 'B';
			  else if (percentage >= 70)
				  grade = 'C';
			  else if (percentage >= 60)
				  grade = 'D';
			  else
				  grade = 'F';
			  }
			  
			  
		  
		  
		  public void Display()
		  {
			  System.out.println("Students Roll num = " + Rollnum);
			  System.out.println("Students Name = " + name);
			  System.out.println("Students EmailId = " + emailId);
			  System.out.println("Students Contact number = " + contact);
			  System.out.println("Students Percentage = " + percentage + "%");
			  System.out.println("Students Grade = " + grade);
			  System.out.println("Students Marks Physics = " + physics);
			  System.out.println("Students Marks Maths = " + maths);
			  System.out.println("Students Marks Biology = " + biology);
			  System.out.println("Students Marks Geography = " + geography);
			  System.out.println("Students Marks History = " + history);
			  System.out.println();
		  }
		  
		  
			public static void main(String[] args) {
				// TODO Auto-generated method stub	
				Student obj =new Student();
				Student obj2 =new Student();
				obj.setData(1, "Suraj", "suraj123@gmail.com", 9975924911l, 94, 95, 88, 87, 89);
				
		        obj2.setData(2, "S", "S123@gmail.com", 9834473639l, 67, 68, 78, 88, 67);
		        obj2.percentage();
		        obj2.grade();
				obj2.Display();
				
			}

}
