package org.tabish.excep;

class Temp
{
 /*   public static void main(String...s)
    {
       
      int i=10/0;
      System.out.println(i);
      System.out.println("this line will not b printed");
    }
 */
     public static void main(String...s)
      {       
        try	
         { int i=10/0;
     	  System.out.println(i);
          System.out.println("this line will not b printed");
     	 }
          catch(ArithmeticException e)   
           {  System.out.println("**this will be printed*****"+e);
              System.out.println(e);
           }
     

      }

}