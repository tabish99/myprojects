package org.tabish.io.s;


import java.io.*;
import java.util.*;

class MyScanner
{

	public static void main(String...s2)
        {
            Scanner s=new Scanner(System.in); 
            String s1="";
          /* int i=s.nextInt();       
           double d=s.nextDouble(); 
            float f=s.nextFloat();       
           long l=s.nextLong(); 
              System.out.println(i);
             System.out.println(i+l+f+d);
            */  
               while(!s.equals("stop"))
               {
                 s1=s.nextLine(); 
                  System.out.println(" ..."+s1);//s.nextInt()+
               }

        }
}