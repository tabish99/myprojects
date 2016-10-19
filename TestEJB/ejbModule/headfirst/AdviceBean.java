package headfirst;

import java.rmi.RemoteException;

import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class AdviceBean1
 */
@Stateless
public class AdviceBean implements SessionBean {


	private static final long serialVersionUID = -8164119269217059355L;

		@Override
    public void ejbActivate() throws EJBException, RemoteException
	    {System.out.println("ejbactivate");   
	    }

	@Override
    public void ejbPassivate() throws EJBException, RemoteException
	    {
		   System.out.println("ejbpassivate");
	    }

	@Override
    public void ejbRemove() throws EJBException, RemoteException
	    {
		   System.out.println("ejbremove");
	    }

	@Override
    public void setSessionContext(SessionContext arg0) throws EJBException,
            RemoteException
	    {
		    System.out.println("setsessioncontext");
	    }
	
	public void ejbCreate(){	
		System.out.println("in ejb create");
	}
	
	public String getAdvice()
		{
			System.out.println("in get advice");
			
		return "from advice method ejb tabish hello from remote ";
		}
}
