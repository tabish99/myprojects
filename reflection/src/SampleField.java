import java.lang.reflect.*;
import java.awt.*;
class SampleField
{
 	 public static void printFields(Object o)
	  {
	    Class c=o.getClass();
            Field f[]=c.getFields();	
              for(int i=0;i<f.length;i++)
              {
                 System.out.println("");
                  Class type=f[i].getType();   // return datatype
              System.out.println(type.getName());
	      System.out.println(" "+f[i].getName());   
              }	
       	  }
    public static void main(String...s)
    {

      Color c=new Color(1,1,1);
       printFields(c);
    }

}