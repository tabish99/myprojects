import java.util.*;
class TaskScheduling
{
   public static void main(String...s)
   {

    Timer timer=new Timer();
    int delay=5000;   
    int period=1000;  // repeat after 1 sec

    timer.scheduleAtFixedRate(new Task(),period,delay);

   }

}