class Thread1 extends Thread
{

  Thread1(String s)
  {
     super(s);
      //run();  
  }
    public void run()
    {
       for(int i=0;i<5;i++)
        {
          try{ Thread.sleep(1000);
               System.out.println(getName());                  
              }           
           catch(Exception e){System.out.println(e);}
     
        }
       System.out.println(getName()+"dead");
       System.out.println(Thread.getAllStackTraces());
 
       System.out.println("thread id is"+this.getId());
       
       System.out.println("priority t1:"+this.getPriority());
        System.out.println("getstacktrace :"+this.getStackTrace());
        System.out.println("toString(thread's name, priority, and thread group.)"+this.toString());     
       System.out.println("no of active thread in a group"+this.activeCount());     
         System.out.println("get state of thread"+this.getState());     
       System.out.println("set priority ");
       this.setPriority(Thread.MAX_PRIORITY);
       System.out.println("priority t1 max:"+this.getPriority());
    }

}