import java.lang.reflect.*;
import java.io.*;
import java.awt.*;
class SampleModifier
{
    public static void printModifier(Object o)throws Exception
    {
      Class c=o.getClass();
     //   Class c=Class.forName("java.awt.Graphics");
        int m=c.getModifiers();
 
        if(Modifier.isPublic(m))
         {
           System.out.println("public");
         }
        
         if(Modifier.isFinal(m))
         {
           System.out.println("final");
         }
        
         if(Modifier.isAbstract(m))
         {
           System.out.println("Abstract");
         }

    }

     public static void main(String...s)throws Exception
     { 
        String a=new String("aaaa");  
         printModifier(a);
     }

}