package pack;
import java.rmi.RemoteException;

import javax.ejb.SessionBean;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;

@Stateless
public class DemoBean implements SessionBean
{
	/**
     * 
     */
    private static final long serialVersionUID = 1L;
	public void setSessionContext(SessionContext ctx){}
	public void ejbCreate(){
	System.out.println("EJB CREATED");
	}
	public void ejbActivate(){}
	public void ejbPassivate(){}
	public void ejbRemove(){}
	
	public int add(int a,int b) throws RemoteException
	{
	return (a+b);
	}
	
	//http://localhost:7001/EjbWebWeb/ejbweb
	
}



