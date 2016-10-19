package org.tabish.excep;

class Temp2
{
   public static void main(String...s)
	   {
       try
       {                            //java Temp2 a b c   comment line arguement s.length=3
          int x=10/s.length;       //java Temp2 blank array will be passed of length 0 int a[]={};
         System.out.println(x);
       }
         catch(ArithmeticException e)
        {
           System.out.println("abe dekh kar divide kar nA"+e);
        } 
           try
          { 
           int z[]=new int[s.length];
            z[10]=1000;      //array index out of bound
          }
       	   catch(ArrayIndexOutOfBoundsException e)
           {
            System.out.println("array m kitna daloge ArrayIndexOutOfBound");       
           } 
    
    }




}