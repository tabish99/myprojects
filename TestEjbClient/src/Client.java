import java.util.*;
import javax.naming.*;
import javax.rmi.*;

public class Client
{
 public static void main(String as[])
 {
  try{
   Properties p=new Properties();
   p.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");//home stub is present
   p.put(Context.PROVIDER_URL,"t3://localhost:7001");
   InitialContext ctx=new InitialContext(p);
             
	Object home=ctx.lookup("registeringHome1");          	
	pack.DemoHome h=(pack.DemoHome)PortableRemoteObject.narrow(home,pack.DemoHome.class);//to use for linux also(same as unicastremote object in rmi)


  pack.Demo  rstub=h.create();
 System.out.println(rstub.add(100,700));

  }catch(Exception e){System.out.println("Exception caught : " + e);}
 }
}


 //pack.DemoHome home=(pack.DemoHome)ctx.lookup("DemoHome3");  