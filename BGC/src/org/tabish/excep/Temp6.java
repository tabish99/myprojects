package org.tabish.excep;

class Temp6
{
  int age;
   void get(int age)
   {
        if(age<18)
        {
          try
           { 
            throw new ArithmeticException("invalid_age");  //+                       
           }    
           catch(ArithmeticException e)
           {
               System.out.println("ttt"+e);
            }             
        }
       else
        {
          System.out.println("your age is 18");
        }  
   } 
   public static void main(String...s)
   {     
     Temp6 t=new Temp6();
      t.get(16);
   }   
}
/*
+ every inbuilt exception class in java contain 1 constrctr which takes strig type of argument  
+ therefore we pass strig in inbuilt exception class i.e we r throwing exxcptn explctly
+hrow keyword is used to throw exception explicitly
=throw genrally throw the object of custom  exception class
*/