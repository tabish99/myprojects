package org.tabish.io;

import java.io.*;
class DataRead
{
      public static void main(String...s1)throws IOException
	{
	 DataInputStream din=new DataInputStream(new FileInputStream("MyFile.txt"));//deprication	
	
      String s="";
   while(s!=null)
   {
    s=din.readLine();
     System.out.println(s);
    
   }

   din.close();
  
       }
}