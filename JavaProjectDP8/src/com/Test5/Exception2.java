package com.Test5;

public class Exception2 {



   int count = 0;
 
    void A() throws Exception
    {
        try
        {
            count++;
           
            try
            {
                count++;
 
                try
                {
                    count++;
                    throw new Exception();
 
                }
                 
                catch(Exception ex)
                {
                    count++;
                    throw new Exception();
                }
            }
             
            catch(Exception ex)
            {
                count++;
            }
        }
         
        catch(Exception ex)
        {
            count++;
        }
 
    }
 
    void display()
    {
        System.out.println(count);
    }
 
    public static void main(String[] args) throws Exception
    {
    	Exception2 obj = new Exception2();
        obj.A();
        obj.display();
    }
}


	

