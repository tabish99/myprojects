package org.tabish.io;
import java.io.*;
class Demo2
{
    public static void main(String...s)throws IOException
     {
                                 /*throw data where ever you want from sop
                                   by function setOut we force to print(throw) data to our choice/place                              
                                   in this case file.... network,printer,.... see System class ct*/

        FileInputStream fr=new FileInputStream("MyFile.txt");

       System.setIn(fr);
       int i=0;

         while((i=System.in.read())!=-1)
      {   
             
        System.out.print((char)i);
       }

        fr.close();

      }


}