package org.tabish.io;
import java.io.*;
class Demo1
{
    public static void main(String...s)throws IOException
     {
                                 /*throw data where ever you want from sop
                                   by function setOut we force to print(throw) data to our choice/place                              
                                   in this case file.... network,printer,.... see System class ct*/

        PrintStream ps=new PrintStream(new FileOutputStream("MyFile.txt",true));

       System.setOut(ps);                   //only accept of printStream
      System.out.println("from Demo1 out..blblbl........");



        PrintStream ps2=new PrintStream(new FileOutputStream("MyFile.txt",true));
       System.setErr(ps2);
      System.err.println("from Demo1 err..........");




      }


}