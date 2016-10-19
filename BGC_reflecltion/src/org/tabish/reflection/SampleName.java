package org.tabish.reflection;


import java.lang.reflect.*;
import java.awt.*;
class SampleName
{
    public static void printName(Object o) 
    {
       Class  c=o.getClass();
       System.out.println(c.getName()); 
    }
     public static void printName(String s)
    {
      try{ 
           Class c=Class.forName(s);           //throws class not found exception object will be available
           System.out.println(c.getName()); 
            StringBuffer sb=(StringBuffer)c.newInstance();      // creating object w/o using new operator      
            System.out.println(sb.length()); 
            System.out.println(sb.capacity()); 
          
          }         
         catch(Exception e)
         {  System.out.println(e);           
         }  
    }


  public static void main(String...s)
  {
    Button b=new Button("hh");
    printName(b);
    printName("java.lang.StringBuffer");
    Class c=java.lang.Thread.class;
    System.out.println(c.getName());
  }

}