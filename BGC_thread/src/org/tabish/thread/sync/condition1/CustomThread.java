package org.tabish.thread.sync.condition1;

class CustomThread extends Thread
{
   Shared s;
       public CustomThread(Shared s,String str)
       {
          super(str);            
           this.s=s;
            start();
        }   

     public void run()
      {
         s.show(Thread.currentThread().getName(),10);
        
      }
}