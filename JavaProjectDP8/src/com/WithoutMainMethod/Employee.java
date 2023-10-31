package com.WithoutMainMethod;

public class Employee {
	int eid;
	String name,desg,dname,addr,email;
	long contactNum;
	double sal;
	boolean fulltimeStatus;
	
	public void SetData(int id, String ename, String esg, String dn, String add, String mail,long contact,double sl, boolean fulltime  )
	{
     eid=id;
     name=ename;
     desg=esg;
     dname=name;
     addr=add;
     email=mail;
     contactNum=contact;
     sal=sl;
     fulltimeStatus=fulltime;
     
     
	}
	public void Display()
	{
		System.out.println("Employee id" +eid);
		System.out.println("Employee name" +name);
		System.out.println("Employee desg" +desg);
		System.out.println("Employee dname" +dname);
		System.out.println("Employee addr" +addr);
		System.out.println("Employee email" +email);
		System.out.println("Employee sal" +sal);
		System.out.println("Employee fulltimeStatus" +fulltimeStatus);
		System.out.println("Employee contactnum" + contactNum);
		
	}
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj = new Employee();
		
		obj.SetData(1, "Suraj"," Developer", "Sw developer","pune","suraj123@gmai.com",9975924911L,900000,true );
		obj.Display();
		obj.SetData(2, "Abhi", "Developer", "Sw", "pune", "Abhi@123", 9834473639L,800000,true);
		
	}

}
