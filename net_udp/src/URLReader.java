import java.io.*;
import java.net.*;

class URLreader
{
   public static void main(String...s)throws Exception
   {
     URL yahoo=new URL("http://www.google.com/");
     BufferedReader in=new BufferedReader(yahoo.openStream()); 
     String inputline;

      while((inputLine=in.readLine())!=null)
       { 
        System.out.println(inputline);
       }       

    in.close();
    }

}