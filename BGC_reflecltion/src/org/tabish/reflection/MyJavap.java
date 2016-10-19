package org.tabish.reflection;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class MyJavap
{
public static void printName(Object o)
  {
    Class c=o.getClass();
           int m=c.getModifiers();
 
        if(Modifier.isPublic(m))
         {
           System.out.print("public ");
         }
        
         if(Modifier.isFinal(m))
         {
           System.out.print("final ");
         }
        
         if(Modifier.isAbstract(m))
         {
           System.out.print("Abstract ");
         }
         System.out.print((String)o);
        System.out.print(" extends ");
        printParent(o);
        System.out.print(" implements ");
      

}



public static void printConstructor(Object o)
  {
    Class c=o.getClass();
          
    Constructor cs[]=c.getConstructors();
      for(int i=0;i<cs.length;i++)
       {  
          System.out.print(c.getName()+"(");
           Class type[]=cs[i].getParameterTypes();
             for(int k=0;k<type.length;k++)        
              {
                System.out.print(","+type[k].getName());  
              }
               System.out.print(")");
               System.out.println(" ");
       }
  } 


 public static void printParent(Object o)
   {
     Class c=o.getClass();
     Class inter=(Class) c.getSuperclass();
     
      System.out.println(inter.getName()); 
   }



 public static void printInterfaces(Object o)
   {
     Class c=o.getClass();
     Class inter[]=c.getInterfaces();
     for(int i=0;i<inter.length;i++)
      System.out.println(inter[i].getName()); 
   }

 
public static void printMethods(Object o)
   {
     Class c=o.getClass();
     Method m[]=c.getMethods();

 
      
      for(int i=0;i<m.length;i++)    
       { int mo=m[i].getModifiers();
         if(Modifier.isPublic(mo))
         {
           System.out.print("public ");
         }    
         if(Modifier.isFinal(mo))
         {
           System.out.print("final ");
         }        
         if(Modifier.isAbstract(mo))                  //kk
         {
           System.out.print("Abstract ");
         }      
            if(Modifier.isStatic(mo))                  //kk
         {
           System.out.print("static ");
         }      

         System.out.print(m[i].getReturnType().getName());  
         System.out.print(" "+m[i].getName());
         System.out.print("(");   
         Class type[]=m[i].getParameterTypes();
            for(int k=0;k<type.length;k++)
            {
              System.out.print(type[k].getName()+","); 
            }
          System.out.print(")");
          System.out.println("");
        }     
   }

public static void main(String...s)
{ 
  try{
  	PrintStream ps=new PrintStream(new FileOutputStream("javap.txt"));
        System.setOut(ps);
      }catch(Exception e){}
   //System.out.println(s[0]);
    printName(s[0]);
    printConstructor(s[0]);
    printInterfaces(s[0]);
    printMethods(s[0]);
//MyJavap mp=new MyJavap();

}
}