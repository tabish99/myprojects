class RunThread
{
    public static void main(String...s)
     {
 
       Thread1 t1=new Thread1("Thread1");
       Thread2 t2=new Thread2("Thread2");
       Thread3 t3=new Thread3("Thread3");

                 t1.start();
                 t2.start();
                 t3.start();
             for(int i=0;i<=20;i++)
              {
                      System.out.println(Thread.currentThread().getName()); 
              }
            System.out.println(Thread.getAllStackTraces());
      }





}