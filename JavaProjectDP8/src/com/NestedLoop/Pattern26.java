package com.NestedLoop;
//1
//212
//32123
//4321234
//543212345
//65432123456
//7654321234567
//876543212345678
//98765432123456789
//876543212345678
//7654321234567
//65432123456
//543212345
//4321234
//32123
//212
//1
public class Pattern26 {
	public int revnum(int d)
	{ int revnum=0;
		while (d>0)
		{
			int rem =d%10;
			d=d/10;
			revnum=revnum*10+rem;
		}
	return revnum;
	}
	public int count(int z)
	{  int count=0;
		while (z>0)
		{
			z=z/10;
			count++;
		}
		return count;
	}
	public int power (int x)
	{
		int power=1;
		for (int o=1; o<=x-1; o++)
		{
			power=power*10;
		}
		return power;
	}
    public void Pattern(int a)
    { int R=0;
    	for (int i=1; i<a+1; i++)
    	{
    		for (int j=1; j<=a-i; j++)
    		{
    			System.out.print(" ");
    		}
    		int num=0;
    		for (int k=1; k<=i; k++ )
    			
    		{   
    			
    			 num=num*10+k;
    			 
    			 
    		}
    	    int G=num;
    	    R= revnum(num);
    		
    		int h=R/10;
    		if (h<=1)
    			System.out.print("1");
    			
    		else 
    		{int p=revnum(h);
    		
    		
    		System.out.print(R);
    		System.out.print(p);
    		}
    	  
    		System.out.println();
    	
    	}
    	int G=R;
    	
    	
    	for (int t=0; t<a; t++)
    	{
    		for (int u=0; u<=t; u++)
    		{
    			System.out.print(" ");
    		}
    	
    		 
        	int x=count(G);
        	int pow=power(x);
        	G=G%pow;
        	
        	if (G!=0)
        		
        	System.out.print(G);
        	int J=revnum(G);
        	int p=count(J);
        	int now=power(p);
        	J=J%now;
        	if (J!=0)
        	System.out.print(J);
    		System.out.println();
    	
    	
    	
    	
    	}
    	
    		
    	
    	
    
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern26 obj =new Pattern26();
		obj.Pattern(9);
	}

}
