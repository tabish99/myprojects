package org.tabish.io.chars;
import java.io.*;
class MyFileWriter           //read/write character by character
{
      public static void main(String...s)throws IOException
      {
                  
         FileWriter fw=new FileWriter("MyFile.txt");  
        //  FileWriter fw=new FileWriter("MyFile.txt",true);//append  
         //FileWriter fw=new FileWriter(new File("g:/MyFile1.txt"));  //different location
         
         String s1="India is great country never give up";
          
         char ch[]=s1.toCharArray();   //convert into char
                                       //dont need to convert into char

          for(int i=0;i<ch.length;i++)
           {

                 fw.write(ch[i]); // fw.write(ch[i])        
            } 
            //fw.write(s)  
           fw.close();
              
          System.out.println("File created");
                  
}

}