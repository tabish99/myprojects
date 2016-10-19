import java.io.*;
import java.net.*;

public class MyClient1
{
  Socket s;
  ObjectOutputStream dout;

     public MyClient()
      {
        try
         {
           s=new Socket("localhost",8);
           emp e1=new emp(10,"aaa");
     
              dout=new ObjectOutputStream(s.getOutputStream());
               dout.writeObject(e1);
          } catch(Exception e)
            { System.out.println(e);
            }
      }
      
      public static void main(String...s)
      {
         new MyClient1();
      }

}