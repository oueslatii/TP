package Serveur;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public class HelloImp extends UnicastRemoteObject implements Hello{
	public HelloImp() throws RemoteException{
		super();
	}
	public String SayHello() throws RemoteException {
		return "Hello dsi22";
	}
}
