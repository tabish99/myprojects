package pack;
import java.rmi.RemoteException;

import javax.ejb.EJBObject;
public interface Demo extends EJBObject
{
public int add(int a,int b) throws RemoteException;
}
//REMOTTE INTERFACE