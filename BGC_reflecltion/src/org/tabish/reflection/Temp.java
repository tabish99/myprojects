package org.tabish.reflection;


import java.lang.reflect.*;

class Temp
{
  public static void main(String...s)throws Exception
  {
   PrivateObject po=new PrivateObject("the private value");
   Field privatestringfield=PrivateObject.class.getDeclaredField("privatestring");  
   
   privatestringfield.setAccessible(true);
    
   String fieldvalue=(String)privatestringfield.get(po);
  
   System.out.println("field value ="+fieldvalue); 
  } 
}