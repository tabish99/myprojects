package headfirst;
import java.rmi.RemoteException;

import javax.ejb.EJBObject;
import javax.ejb.Local;

@Local
public interface Advice extends EJBObject{

	public String getAdvice() throws RemoteException;
}
