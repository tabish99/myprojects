package org.tabish.net.udp;

import java.io.ObjectOutputStream;
import java.net.Socket;

public class MyClient1
{
  Socket s;
  ObjectOutputStream dout;

     public MyClient1()
      {
        try
         {
           s=new Socket("localhost",8);
           Emp e1=new Emp(10,"aaa");
     
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