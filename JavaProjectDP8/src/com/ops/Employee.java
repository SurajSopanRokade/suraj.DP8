package com.ops;
import java.util.Scanner;
public class Employee {
     int eid;
     double basicsal;
     String ename, email;
     double pf, da, hra;
     double netsal;
     public void setData(int id, double basic, String name, String mail )
     {
    	 eid = id;
    	 basicsal=basic;
    	 ename=name;
    	 email=mail;
    	
     }
     public void pf()
     {
    	 pf=basicsal*0.10;
     }
     public void da()
     {
    	 da=basicsal*0.20;
     }
     public void hra()
     {
    	 hra=basicsal*0.15;
     }
     public void netsal()
     {
    	 netsal=basicsal-pf+da+hra;
     }
     public void display()
     {
    	 System.out.println("Empolyee Id = "+eid);
    	 System.out.println("Empolyee basic sal = "+basicsal);
    	 System.out.println("Empolyee name = "+ename);
    	 System.out.println("Empolyee email = "+email);
    	 System.out.println("Empolyee pf = "+pf);
    	 System.out.println("Empolyee da = "+da);
    	 System.out.println("Empolyee hra = "+hra);
    	 System.out.println("Empolyee netsal = "+netsal);
    	
     }
     
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	 Scanner sc =new Scanner(System.in);
    	 
    	 System.out.println("Enter employee Id ");
    	 int eid=sc.nextInt();
    	 
    	 System.out.println("Enter basic sal ");
    	 double basicsal=sc.nextDouble();
    	 
    	 System.out.println("Enter employee name ");
    	 String ename=sc.next();
    	 
    	 System.out.println("Enter employee mail ");
    	 String email=sc.next();
    	
    	 Employee obj = new Employee();
    	   obj.setData(eid,basicsal,ename,email);
    	   obj.pf();
    	   obj.da();
    	   obj.hra();
    	   obj.pf();
    	   obj.netsal();
    	   obj.hra();
    	   obj.display();
    	   
	}

}
