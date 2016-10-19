import java.awt.*;
import javax.swing.*;

class ShutdownHooks implements Runnable
{
  public void run()
  {
    System.out.println("***shutdown hooks started ***");
    System.out.println("***Application shutting down***");
     try
      {
        Thread.sleep(1000*5);
      }catch(Exception e){}; 
  }
  
  public static void main(String...s)
  {
    Runtime runtime=Runtime.getRuntime();
    ShutdownHooks hook=new ShutdownHooks();
    //Thread t=new Thread(hook);
           

    //registering the shutdown hook
       runtime.addShutdownHook(new Thread(hook));
    int x=10/0;
    JFrame testframe=new JFrame("Test frame");
     testframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
  
     testframe.setSize(100,100);
     testframe.setVisible(true);
     System.out.println("hello"+runtime.availableProcessors());
  }
}