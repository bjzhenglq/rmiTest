package dataclient.start;


import rmi.service.UserManagerInterface;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class ClientStart {

	public static void main(String[] args) throws AlreadyBoundException,
			RemoteException {
		try {
			Registry registry = LocateRegistry.getRegistry("localhost", 20010);
			UserManagerInterface inter = (UserManagerInterface) registry
					.lookup("userManager");
			System.out.println(inter.getAdminAccount().getUserName());
			System.out.println(inter.getAdminAccount().getPassword());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
