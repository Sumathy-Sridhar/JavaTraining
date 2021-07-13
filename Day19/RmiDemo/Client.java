package RmiDemo;

import java.rmi.*;
import java.rmi.server.*;

public class Client {
    public static void main(String[] arg) throws Exception {
        ServerInterface r = (ServerInterface) Naming.lookup("rmi://127.0.1.1/mca");
        System.out.println("The Addition of a+b" + r.add(5, 5));
    }
}
