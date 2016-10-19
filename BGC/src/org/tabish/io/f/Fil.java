package org.tabish.io.f;


import java.io.*;
class Fil
{
   public static void main(String...s)throws IOException
   {
         int i=0;
     File f=new File("g:\\temp");
          f.mkdir();     //representing folder by f
       

     
     File f1=new File("g:\\temp1","abc.txt");//rprsntg file by f1
           System.out.println(f1.exists());   //file not exist           
                          

   

     File f2=new File(f,"abc.txt");//from1
         f2.createNewFile();



      File f3=new File("g:");
       String s1[]=f3.list();
    
          while(i!=s1.length)
            System.out.println(s1[i++]);
    }
}