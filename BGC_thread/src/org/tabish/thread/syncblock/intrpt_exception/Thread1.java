class Thread1 extends Thread
{  
      Thread1(String s)
       { 
         super(s);
        
       }
      public void run()
      { 
       System.out.println(getName());
           try
            {
              Thread.sleep(10000*10);              
            }catch(Exception e)
              {System.out.println("Interrupted forcely"+e);
              }  
       System.out.println(getName()+"dead");
       }
}