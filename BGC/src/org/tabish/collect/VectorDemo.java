package org.tabish.collect;


import java.util.*;

class VectorDemo
{
   public static void main(String []s)
   {
    Vector a1=new Vector(3,2);
     System.out.println("ini"+a1.capacity());
     System.out.println(a1.size());
       
      a1.addElement("a");
      a1.addElement("b");   //method of enumeration
      a1.addElement("a");
      a1.addElement("b"); 

   System.out.println("cap"+a1.capacity());
   System.out.println(a1.size());
  
    a1.removeElementAt(2);
    Enumeration e1=a1.elements();

       while(e1.hasMoreElements())
       { String ss=(String)e1.nextElement();
         System.out.println(ss);   
       }
       System.out.println(" ");

     Iterator e=a1.iterator();
       while(e.hasNext())
        {
          String s1=(String)e.next();     
          System.out.println(s1);
        }
   }


}