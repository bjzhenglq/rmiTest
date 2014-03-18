package dataserver.rim.impl;

import java.rmi.RemoteException;

import rmi.bean.Account;
import rmi.service.UserManagerInterface;

public class UserManagerImpl implements UserManagerInterface {

	@Override
	public String getUserName() throws RemoteException {
		// TODO Auto-generated method stub
		return "Tommy Lee";
	}

	@Override
	public Account getAdminAccount() {
		Account account = new Account();
		account.setPassword("admin");
		account.setUserName("admin");
		return account;
	}

}
