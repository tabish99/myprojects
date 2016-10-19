class Thread3 implements Runnable
{
   int x; 
    public void run()
    {
       for(int i=0;i<5;i++)
        {
          System.out.println(Thread.currentThread().getName()+" "+x);       
         try
          {
             Thread.sleep(100);
           }catch(Exception e){System.out.println(e);}           
        }
     }
}