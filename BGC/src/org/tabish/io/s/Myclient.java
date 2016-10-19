package org.tabish.io.s;


import java.io.*;
import java.util.*;
public class Myclient
{
  ObjectOutputStream dout;
 public Myclient()
 {
   try
    {                        // 5 and 50 not saved (static transient)
      Emp e1=new Emp("duacat",10,5,20,500);
      dout=new ObjectOutputStream(new FileOutputStream("ducat.txt"));     
       dout.writeObject(e1);
       dout.flush();
    }
      catch(Exception e){ System.out.println(e); }
  }

  public static void main(String...s)
  {
     new Myclient();  
  } 
}


/*import java.io.*;
public class Base 
{
int z=50;
}
*/   