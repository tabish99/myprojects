package org.tabish.reflection;


import java.lang.reflect.*;
import java.awt.*;
class SampleSuper
{
    public static void printSuperClasses(Object o) 
    {
       Class  subclass=o.getClass();
       Class  superclass=subclass.getSuperclass();
     
      while(superclass!=null)
      {
        System.out.println(superclass.getName());   
         subclass=superclass;
         superclass=subclass.getSuperclass(); 
      }
    }


  public static void main(String...s)
  {
   Frame f=new Frame("aa");
    printSuperClasses(f);
  }

}