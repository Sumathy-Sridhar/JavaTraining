import java.io.*;
public class Deserialize {
    
    public static void main(String args[]){  
        try{  
       
        ObjectInputStream in=new ObjectInputStream(new FileInputStream("serialixe.txt"));  
        Employee em=(Employee)in.readObject();  
        System.out.println("Serialized Objects: ");
        System.out.println(em.empid+" "+em.empname);  
        //closing the stream  
        in.close();  
        }
        catch(Exception e){System.out.println(e);}  
       }  
}
