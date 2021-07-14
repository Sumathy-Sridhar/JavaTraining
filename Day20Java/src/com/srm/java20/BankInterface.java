package com.srm.java20;
import java.rmi.*;

public interface BankInterface  extends Remote {
	 int withdraw(int a,int amt)throws RemoteException;
	  int balance(int amt)throws RemoteException;
}
