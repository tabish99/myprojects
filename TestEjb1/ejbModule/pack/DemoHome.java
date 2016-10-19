package pack;

import javax.ejb.CreateException;
import javax.ejb.EJBHome;

public interface DemoHome extends EJBHome
{
public Demo create()throws CreateException,java.rmi.RemoteException;
}