class CustomThread2 extends Thread
{
   Shared s;
       public CustomThread2(Shared s,String str)
       {
          super(str);            
           this.s=s;
            start();
        }   

     public void run()
      {
         s.show(Thread.currentThread().getName(),30);
      }
}