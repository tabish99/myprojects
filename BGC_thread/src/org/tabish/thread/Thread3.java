class Thread3 extends Thread
{

  Thread3(String s)
  {
     super(s);
     // run();   //when you call run method nothing ids goi n to happen
  }
    public void run()
    {
        System.out.println("priority SET T3:");
         this.setPriority(Thread.MAX_PRIORITY);
         System.out.println("priority t3 max:"+this.getPriority());
       for(int i=0;i<5;i++)
        {

           try{ Thread.sleep(1000);
                System.out.println(getName());       
      
              }           
           catch(Exception e){}

     
        }
        System.out.println(getName()+"dead");
 System.out.println("thread id is"+this.getId());
   
     }
}