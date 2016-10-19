
import headfirst.Advice;
import headfirst.AdviceHome;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;

public class AdviceClient
	{

		/**
		 * @param args
		 */
		public static void main(String[] args)
			{
				new AdviceClient().go();
			}

		
		public void go() 
			{
				try{
					/* Properties p=new Properties();
					   p.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");//home stub is present
					   p.put(Context.PROVIDER_URL,"t3://localhost:7001");*/
					   InitialContext in=new InitialContext();
			      	//Context in =new InitialContext();
				          Object o=in.lookup("Advisor");
				          AdviceHome home1 =(AdviceHome)PortableRemoteObject.narrow(o, AdviceHome.class);
				          
				          Advice advisor = (Advice)home1.create();
				        						          
				          System.out.println("advisor : "+ advisor.getAdvice());
				
				
				}catch (Exception e) {
					System.out.println(e);
				}
			}
		
	}
