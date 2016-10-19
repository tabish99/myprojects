package org.tabish.io.chars;

import java.io.*;
class MyCharWriter
{

   public static void main(String...s)throws IOException
   {

    CharArrayWriter fw=new CharArrayWriter();//not connected nothing passed but still work
  
    String s1="india is good country never give up";

     char ch[]=s1.toCharArray();

     for(int i=0;i<ch.length;i++)
     {

      fw.write(ch[i]);  //writing to buffer
     }              
                 //(where to throw data)
                 //(take argument of output strm output strem is abstract so give to child)       
      fw.writeTo(new FileWriter("rabari.txt"));//1 copy moved to rabari.txt(data still in the buffer)        

      System.out.println(fw.toString());//data is still there

                //now no need
      char z[]=fw.toCharArray();  
     CharArrayReader fr= new CharArrayReader(z);
       int i=0;

        while((i=fr.read())!=-1)            //fetchig from buffer
         System.out.println((char)i); 

   }
     
}