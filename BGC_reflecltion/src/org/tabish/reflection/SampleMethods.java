package org.tabish.reflection;


import java.lang.reflect.*;
import java.awt.*;
class SampleMethods
{
   public static void printMethods(Object o)
   {
     Class c=o.getClass();
     Method m[]=c.getMethods();
       for(int i=0;i<m.length;i++)    
       {
         System.out.println(m[i].getReturnType().getName());  
         System.out.println(" "+m[i].getName());
         System.out.println("(");   
         Class type[]=m[i].getParameterTypes();
            for(int k=0;k<type.length;k++)
            {
              System.out.println(type[k].getName()+","); 
            }
          System.out.println(")");
          System.out.println("");
        }     
   }


   public static void main(String...s)
   {
      String t=new String("ss");
         printMethods(t);
   }
}