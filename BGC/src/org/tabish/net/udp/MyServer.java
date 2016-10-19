package org.tabish.net.udp;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer
{
  ServerSocket ss;
  Socket s;
  ObjectInputStream dis;

       public MyServer()
        {
          try{
               System.out.println("server started");
               ss=new ServerSocket(8);          
                s=ss.accept();
               System.out.println("client connected");
                  dis=new ObjectInputStream(s.getInputStream());
                 Emp z=(Emp)dis.readObject();
                  z.show();
              }catch(Exception e){System.out.println(e);}
        }
  
     public static void main(String...s)
      {
        new MyServer();
      }

}