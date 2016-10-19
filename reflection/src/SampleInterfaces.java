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
     t t1=new t();
    printInterfaces(t1);
   }

}
interface a1
{
}

interface a2
{
}

class t implements a1,a2
{
}
