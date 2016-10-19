import java.io.*;
import java.net.*;

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
                 emp z=(emp)dis.readObject();
                  z.show();
              }catch(Exception e){System.out.println(e);}
        }
  
     public static void main(String...s)
      {
        new MyServer();
      }

}