package org.tabish.io;
import java.io.*;
class MyFileWriter           //read/write character by character
{
      public static void main(String...s)throws IOException
      {
                  
        // FileOutputStream fw=new FileOutputStream("MyFile.txt");  
        //  FileOutputStream fw=new FileOutputStream("MyFile.txt",true);//append  
         FileOutputStream fw=new FileOutputStream(new File("g:/MyFile.txt"));  //different location
         
         String s1="India is great country never give up";
          
         byte ch[]=s1.getBytes();   //convert into bytes
      

          for(int i=0;i<ch.length;i++)
           {

                 fw.write(ch[i]);        
            } 
           fw.close();
              
          System.out.println("File created");
                  

}




















}