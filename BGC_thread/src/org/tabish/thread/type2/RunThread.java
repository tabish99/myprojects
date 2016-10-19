class RunThread
{
    public static void main(String...s)
     {
 
       Thread1 t1=new Thread1();
       Thread tt1=new Thread(t1);
              tt1.start(); 
         
      Thread tt2=new Thread(t1,"Thread2");
              tt2.start();

      Thread2 t2=new Thread2("tabi");
              
               t2.start();
      }

}