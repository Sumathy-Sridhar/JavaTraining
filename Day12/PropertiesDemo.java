import java.util.*;
public class PropertiesDemo {
    public static void main(String[] args)
    throws Exception {
    Properties p =new Properties(System.getProperties());
    System.setProperties(p);
    System.getProperties().list(System.out);
   
    } 
}
