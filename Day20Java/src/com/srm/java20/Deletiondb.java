package com.srm.java20;
import java.sql.*;
public class Deletiondb {

	public static void main(String[] args) {
		try
		{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdetails","root","root");  
			Statement st=con.createStatement(); 
			st.executeUpdate("delete from student where Id=6");     
			System.out.println("Record deleted\n"); 
			System.out.println("Table Details:(After Deletion) ");
			System.out.println("***********************************");
			ResultSet rs=st.executeQuery("select * from student");  
			while(rs.next())
			{
			   System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			}     
			con.close();  
		 }
		catch(Exception e)
		{ 
			System.out.println(e);
			System.out.println("database not connected");
		}  
    }  
	}
