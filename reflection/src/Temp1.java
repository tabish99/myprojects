import java.lang.reflect.*;

class Temp1
{
   public static void main(String...s)throws Exception
   {
     PrivateObject1 po=new PrivateObject1("the private value");
      	   // Class c[]={int.class};
              Class c=int.class;
         System.out.println(c.getName());
         Method privatestringmethod=PrivateObject1.class.getDeclaredMethod("getPrivateString",null);
         privatestringmethod.setAccessible(true);

        String returnvalue=(String)privatestringmethod.invoke(po,null);
        System.out.println("return value="+returnvalue);
   } 
}