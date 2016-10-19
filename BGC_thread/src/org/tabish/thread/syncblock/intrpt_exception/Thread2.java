class Thread2 extends Thread
{   
    Thread1 t;
      Thread2(String s,Thread1 t)
       { 
         super(s);
         this.t=t;
         //start();
       }
      public void run()
      { 
       System.out.println(getName());
          t.interrupt();
           try
            {
              Thread.sleep(1000);              
            }catch(Exception e)
              {System.out.println(e);}  
       System.out.println(getName()+"dead");
       }
}