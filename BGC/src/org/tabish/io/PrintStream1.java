package org.tabish.io;
import java.io.*;
class PrintStream1           
{
      public static void main(String...s)throws IOException
      {
                  
         //FileOutputStream fw=new FileOutputStream("MyFile.txt");
         FileOutputStream fw=new FileOutputStream("MyFile.txt",true);  //(filestreamoutput buffer ready)
            
         PrintStream ps=new PrintStream(fw);  //high level stream,(connected) to fileoutputstream,network,monitor..etc
         


         ps.println("hello how are you");   //method of printstream  (now write to file) not monitor        
         
        /* only system class has the permission to intract to the input output device thats why (all is done in
           system class)

         */
      }         

}



