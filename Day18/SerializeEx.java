import java.io.*;  
class SerializeEx{
 public static void main(String args[]){  
  try{  
 Employee s1 =new Employee(101,"Mathew");  
  FileOutputStream fout=new FileOutputStream("serialixe.txt");  
  ObjectOutputStream out=new ObjectOutputStream(fout);  
  out.writeObject(s1);  
  out.flush();  
  out.close();  
  System.out.println("Employee Details:");  
  System.out.println("Employee Id: " +s1.empid);
  System.out.println("Employee Name: "+s1.empname);
  }catch(Exception e){System.out.println(e);}  
 }  
}  