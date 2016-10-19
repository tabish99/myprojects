package org.tabish.excep;

class Temp1
{
    public static void main(String...s)
    {
      try
       {
                             //if java Temp only then blanked array is passedto psvm s int x[]={};
         int x=10/s.length;   //if java Temp a b c i.e 3 arguement is passed to main s(s.length=3)
         System.out.println(x);
         int z[]=new int[s.length];
          z[10]=1000;      //array index out of bound
       }
       catch(ArithmeticException e)
        {
           System.out.println(e);
        
        } 
    
    }
   

}

/* command line arguement
if java Temp thn blanked array is passed of 0 length


*/