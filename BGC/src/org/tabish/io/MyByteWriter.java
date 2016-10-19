package org.tabish.io;
import java.io.*;
class MyByteWriter
{

   public static void main(String...s)throws IOException
   {

    ByteArrayOutputStream fw=new ByteArrayOutputStream();//not connected nothing passed but still work
  
    String s1="india is good country never give up";

     byte ch[]=s1.getBytes();

     for(int i=0;i<ch.length;i++)
     {

      fw.write(ch[i]);  //writing to buffer
     }              
                 //(where to throw data)
                 //(take argument of output strm output strem is abstract so give to child)       
      fw.writeTo(new FileOutputStream("rabari.txt"));//1 copy moved to rabari.txt(data still in the buffer)        

      System.out.println(fw.toString());//data is still there

                //now no need
      byte z[]=fw.toByteArray();  
     ByteArrayInputStream fr= new ByteArrayInputStream(z);
       int i=0;

        while((i=fr.read())!=-1)            //fetchig from buffer
         System.out.println((char)i); 

   }
     
}