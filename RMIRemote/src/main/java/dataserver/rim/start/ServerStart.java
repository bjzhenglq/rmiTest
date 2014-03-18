package dataserver.rim.start;

import java.io.IOException;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import dataserver.rim.impl.UserManagerImpl;
import rmi.service.UserManagerInterface;

public class ServerStart {

	public static void main(String[] args) throws AlreadyBoundException,
			RemoteException {
		UserManagerImpl impl = new UserManagerImpl();
		UserManagerInterface inteface = (UserManagerInterface) UnicastRemoteObject
				.exportObject(impl, 0);
		Registry registry = LocateRegistry.createRegistry(20010);
		registry.rebind("userManager", inteface);
		System.out.println("Server is ready");
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
