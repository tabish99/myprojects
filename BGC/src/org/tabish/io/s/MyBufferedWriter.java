package org.tabish.io.s;


import java.io.*;

class MyBufferedWriter
{
  public static void main(String...s1)throws IOException
  {
     InputStreamReader ir=new InputStreamReader(System.in);   //convert into reader
     BufferedReader br= new BufferedReader(ir);               //connected br has raed line method
     
     FileWriter fw=new FileWriter("abc.txt");   
     BufferedWriter bw=new BufferedWriter(fw);
     
     PrintWriter pw=new PrintWriter(fw);
     
     String s=" ";
     while(!s.equals("stop"))
     {
        s=br.readLine();
       // bw.write(s);
       //bw.write(" ");         //write into file without newline into
       
        pw.println(s);          //write into file with newline into   
        pw.flush();
     } 
      br.close();
      bw.close();
      fw.close();
   }
} 