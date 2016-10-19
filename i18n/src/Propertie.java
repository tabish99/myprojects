import java.util.*;
import java.io.*;
public class Propertie
{
  public static void loadProperties()
  {
    Properties loadprops=new Properties();
     FileInputStream fi=null; 

  try{
         fi=new FileInputStream("application.Properties");
            loadprops.load(fi);
        Enumeration names=loadprops.propertyNames();       

          while(names.hasMoreElements())
            {
              String key=(String)names.nextElement();
             String v=loadprops.getProperty(key);
            System.out.println(key+"="+v); 
            }

      }catch(Exception e)
            {
               System.out.println(e+"kk"); 
            }
  }



  public static void main(String...s)
 {
    loadProperties();
  }

}