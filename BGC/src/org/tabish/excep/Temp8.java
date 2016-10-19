package org.tabish.excep;

import java.io.*;
class Temp8
{
  int divide(int x,int y) throws ArithmeticException
   {
    return x/y;
   }
  
  void display() throws IOException//it will be thrown from where it is called
   {
     divide(10,0);
   }
}

class Demo1
{
public static void main(String...s) throws IOException//throws IOException
   {
      Temp8 t=new Temp8();
         t.display(); 
   }

}