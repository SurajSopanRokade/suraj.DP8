package com.NestedLoop;
//* * * * * * * * * * 
//* * * * * * * * * 
// * * * * * * * * 
//  * * * * * * * 
//   * * * * * * 
//    * * * * * 
//     * * * * 
//      * * * 
//       * * 
//        * 
//       * * 
//      * * * 
//     * * * * 
//    * * * * * 
//   * * * * * * 
//  * * * * * * * 
// * * * * * * * * 
//* * * * * * * * * 
//* * * * * * * * * * 


public class Pattern22 {
   public void pattern (int a)
   {
	   for (int i=0; i<a; i++)
	   {
		   for (int k=0; k<=i; k++)
		   {
			   System.out.print(" ");
		   }
		   for (int j=0; j<a-i; j++)
		   {
			   System.out.print("*"+" ");
		   }
		   
		   System.out.println();
	   } 
	   for (int h=1; h<a; h++ )
	   {
		   for (int m=0; m<a-h; m++)
		   {
			   System.out.print(" ");
		   }
		   for (int l=0; l<=h; l++)
		   {
			   System.out.print("*"+" ");
		   }
		  
		   System.out.println();
	   }
		   
	   }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern22 obj =new Pattern22();
		obj.pattern(10);
		
	}

}
