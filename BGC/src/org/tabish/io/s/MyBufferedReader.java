package org.tabish.io.s;


import java.io.*;
class MyBufferedReader
{
  public static void main(String...s1)throws IOException
  {
     FileReader fr=new FileReader("abc.txt"); 
     BufferedReader br=new BufferedReader(fr);
     String s="";

     while(s!=null)
      {
             s=br.readLine();
             if(s!=null)
               System.out.println(s);
      }
  }

}