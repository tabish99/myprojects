package org.tabish.io;
import java.io.*;
import java.util.*;
class Finput
{
 
    public static void main(String...s1)throws IOException
    {
    // SequenceInputStream sin=new SequenceInputStream(new FileInputStream("MyFile.txt"),new FileInputStream("MyFile1.txt"));
     

      SequenceInputStream sin=new SequenceInputStream(new MyEnum());

      DataInputStream din=new DataInputStream(sin);
      String s="";
    while(s!=null)
    {
      s=din.readLine();
       if(s!=null) 
        System.out.println(s);
    }
     din.close();
}
}



class MyEnum implements Enumeration
{
InputStream in[];
int i=0;
   MyEnum()
   {
      try
      {
        in=new InputStream[]{new FileInputStream("MyFile.txt"),
                             new FileInputStream("MyFile1.txt"),
                             new FileInputStream("rabari.txt")
                            };
          
      }catch(Exception e){}
   }

    public boolean hasMoreElements()
     {
        if(i<3)
           return true;
        else
           return false; 
     }   


    public Object nextElement()
    {
      return in[i++];
    }


}