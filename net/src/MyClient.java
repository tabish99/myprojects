import java.io.*;
import java.net.*;

public class MyClient
{
  
  Socket s;
   DataInputStream din;
   DataOutputStream dos;

    public MyClient()
      {
        try
         {
             
           s=new Socket("localhost",10);
            System.out.println(s);                  
             din=new  DataInputStream(s.getInputStream());
             dos=new  DataOutputStream(s.getOutputStream());
            Clientchat();
          }           
            catch(Exception e)
             {
                System.out.println(e);
              }
       }

      
   public void Clientchat()throws IOException
     { 
           BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
                   
       
        String s1;   
         do
           { 
              s1=br.readLine();
             
               dos.writeUTF(s1);
               dos.flush();
               System.out.println("Server message:"+din.readUTF());
            }while(!s1.equals("stop")); 
     }          
   
      public static void main(String...s)
       {

         new MyClient();
       }

}