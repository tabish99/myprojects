package org.tabish.io;
import java.io.*;
class MyFileReader           //read/write character by character
{
      public static void main(String...s)throws IOException
      {
                  
        // FileInputStream fr=new FileInputStream("MyFile.txt");  
        //  FileInputStream fw=new FileInputStream("MyFile.txt",true);//append  
         FileInputStream fr=new FileInputStream(new File("g:/MyFile.txt"));  //different location
         
         int i=0;

          while((i=fr.read())!=-1)//fetching from stream buffer byte by byte(not eof(-1) becse we r not reading from file)
           {

                  System.out.println((char)i);        
            } 
           fr.close();
       }    

}
