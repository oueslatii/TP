package Serveur;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Serveur {
	public static void main(String[]args){
		try{
			System.out.println("une autre verstion");
			LocateRegistry.createRegistry(1099);
			HelloImp obj= new HelloImp();
			Naming.rebind("rmi://localhost:1099/HelloServer", obj);
			System.out.println(obj.toString());
		}catch(Exception e){
			e.printStackTrace();
		}
			
		
	}

}
