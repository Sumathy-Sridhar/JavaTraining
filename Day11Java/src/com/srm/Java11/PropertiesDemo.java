package com.srm.Java11;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		 Properties p = new Properties();  
		   p.setProperty("UserName:", "Sumathy");
		   p.setProperty("Password:", "@bcd$123");
		   p.setProperty("Email_Id:","sumi@gmail.com");  
			 
		FileWriter fw = new FileWriter("E:\\info.properties");  
		 p.store(fw,"## Admin Details ##"); 
		 System.out.println("Properties Information written successfully......");
		 System.out.println(p.getProperty("UserName:"));
		 System.out.println(p.getProperty("Password:"));
		 System.out.println(p.getProperty("Email_Id:"));
	}

}
