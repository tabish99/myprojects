import java.awt.*;
import javax.swing.*;

public class ShutdownHook implements Runnable
{
public void run()
{
//System.out.println("***shutdown hookup***");
System.out.println("application is shutting down.....");
try
{
Thread.sleep(3000);
}
catch(Exception e){}
}


public static void main(String...s)
{
Runtime runTime=Runtime.getRuntime();

ShutdownHook hook=new ShutdownHook();

//registering the shutdown hook
runTime.addShutdownHook(new Thread(hook));

//int x=100/0;
JFrame testFrame=new JFrame("rafiuddin khan");
testFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JButton b =new JButton("close and see the result");
testFrame.add(b);
testFrame.setSize(400,400);
testFrame.setVisible(true);
System.out.println("hello");
 }
}
