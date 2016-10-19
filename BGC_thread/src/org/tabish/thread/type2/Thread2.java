class Thread2 extends Thread
{

  Thread2(String s)
  {
     super(s);
      //run();  
  }
    public void run()
    {
       for(int i=0;i<5;i++)
        {
          System.out.println(getName());       
         
        }
          System.out.println(getName()+"dead");
     }
}