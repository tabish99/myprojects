package org.tabish.io;
import java.io.*;
class Run
{
   public static void main(String...s)throws IOException  
   {
    PipedOutputStream pout=new PipedOutputStream();   //dat flow automatically to each other
    PipedInputStream pin=new PipedInputStream();
  
     pout.connect(pin);
     
    Poutput po=new Poutput(pout);
    Pinput  pi=new Pinput(pin);
   
    Thread t1=new Thread(po);
    Thread t2=new Thread(pi);
    t1.start();
    t2.start();
   }
}	

class Poutput implements Runnable
{
  PipedOutputStream pout= new PipedOutputStream();
  Poutput(PipedOutputStream pout)
  {
    this.pout=pout; 
  }
     public void run()
     {
       for(int i=65;i<=91;i++)
        {
         try
           {
             pout.write(i);     
             Thread.sleep(1500);
                
            }catch(Exception e){}       
        }
     }
}



class Pinput implements Runnable
{  
  PipedInputStream pin;
    Pinput(PipedInputStream pin)
    {
       this.pin=pin;
    } 
   public void run()
   {
      int z=0;
      for(int i=65;i<91;i++)
      {
        try
          {
            z=pin.read();
          }catch(Exception e){}
         System.out.println((char)z);
      }
   }
}


