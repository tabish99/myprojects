import java.io.*;
import java.net.*;

public class URLConnectionReader
{
  static String inputline=" ";
  public static void main(String...s)throws Exception
  {
    URL yahoo=new URL("http://www.google.com/");
    URLConnection yc=yahoo.openConnection();
    BufferedReader in=new BufferedReader(new InputStreamReader(yc.getInputStream()));

     while(inputline!=null)
      {
        inputline=in.readLine();
        System.out.println(inputLine);

      }     

   }
    in.close();
}