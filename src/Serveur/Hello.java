package Serveur;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hello extends Remote{
public String SayHello() throws RemoteException;
}
