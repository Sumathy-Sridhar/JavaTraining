package RmiDemo;

import java.rmi.*;
import java.rmi.server.*;

public class ServerImpl extends UnicastRemoteObject implements ServerInterface {
    public ServerImpl() throws RemoteException {
    }

    public int add(int a, int b) throws RemoteException {
        return a + b;
    }
}
