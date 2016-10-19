package org.tabish.io.s;


import java.io.*;
import java.util.*;
class MyStringTokenizer
{
    public static void main(String...s)
    {
        String s1="country=india;hello;my name is k han;";
          
        StringTokenizer st=new StringTokenizer(s1,";=, ");
         

         while(st.hasMoreTokens())  
         {
                        
             System.out.println(st.nextToken());
         }  
    }
}