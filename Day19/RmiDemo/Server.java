package RmiDemo;

import java.rmi.*;
import java.rmi.server.*;

public class Server {
    public static void main(String[] arg) throws RemoteException {
        ServerImpl Obj = new ServerImpl();
        try {
            Naming.rebind("mca", Obj);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Server Started...");
    }
}