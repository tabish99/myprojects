package org.tabish.excep;

class Temp5
{
 public static void main(String...s)
 { T t=new T();
    int c=0;
    int b=2;
      int i=t.show(c);
   System.out.println(i); 
 }  
}

class T
{  
  int show(int i)
   {    try
        {                     //java Temp2 a b c   comment line arguem
          int x=10/i;       //java Temp2 blank array will be passed of length 0 int a[]={};
         System.out.println(x);
          return 10; 
        }
         catch(ArithmeticException e)
        {
           System.out.println("abe dekh kar divide kar nA"+e);
           return 20;
         }
           
             finally
             {  System.out.println("inner finalyy22222");
                return 30;
             }            

   // return 40;
   }//show 
} 