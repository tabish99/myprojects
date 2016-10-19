class Thread2 extends Thread
{

  Thread2(String s)
  {
     super(s);
      //run();  
  }
    public void run()
    { System.out.println("priority SET T2:");
       this.setPriority(Thread.MIN_PRIORITY);
      System.out.println("priority t2 min:"+this.getPriority());
       for(int i=0;i<5;i++)
        {
          System.out.println(getName());       
         try{Thread.sleep(1000);
              }           
           catch(Exception e){System.out.println(e);}

     
        }
System.out.println(getName()+"dead");
 System.out.println("thread id is"+this.getId());
       
       System.out.println("priority t2 min:"+this.getPriority());
   
     }
}