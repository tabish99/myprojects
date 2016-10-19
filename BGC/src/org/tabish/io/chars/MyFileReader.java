package org.tabish.io.chars;
import java.io.*;
class MyFileReader           //read/write character by character
{
      public static void main(String...s)throws IOException
      {
                  
        // FileReader fr=new FileReader("MyFile.txt");  
        //  FileReader fw=new FileReader("MyFile.txt",true);//append  
         FileReader fr=new FileReader(new File("g:/MyFile.txt"));  //different location
         
         int i=0;

          while((i=fr.read())!=-1)//fetching from stream buffer byte by byte(not eof(-1) becse we r not reading from file)
           {

                  System.out.println((char)i);        
            } 
           fr.close();
       }    

}
