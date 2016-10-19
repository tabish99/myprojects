class Thread1 extends Thread
{
  Shared s;
      Thread1(Shared s,String str)
       { 
         super(str);
         this.s=s;
         start();  
       }
      public void run()
      {
       System.out.println(s.withdraw());
      }
}