class Interrupt
{
   public static void main(String...s)
   {
     Thread1 t1=new Thread1("Thread1");   
       t1.setPriority(10);
      
      Thread2 t2=new Thread2("Thread2",t1);   
       
     t1.start();
     t2.start();   
   }

}