package org.tabish.reflection;


import java.lang.reflect.*;
import java.awt.*;
class SampleInterfaces
{
   public static void printInterfaces(Object o)
   {
     Class c=o.getClass();
     Class inter[]=c.getInterfaces();
     for(int i=0;i<inter.length;i++)
      System.out.println(inter[i].getName()); 
   }

  
   public static void main(String...s)
   {
     t1 t=new t1();
    printInterfaces(t);
   }

}
interface a1
{
}

interface a2
{
}

class t1 implements a1,a2
{
}
