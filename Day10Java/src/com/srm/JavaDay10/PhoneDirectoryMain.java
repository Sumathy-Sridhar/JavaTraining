package com.srm.JavaDay10;
import java.util.*;
public class PhoneDirectoryMain {
	public static void display(TreeMap<String,Integer> tmap)
	{
		for(Map.Entry<String, Integer> e:tmap.entrySet())
		{
			System.out.println("Customer name: "+e.getKey()+" Phone number: "+e.getValue());
		}	
	}

	public static void main(String[] args) {
		TreeMap<String,Integer> tmap=new TreeMap<String,Integer>();
			int n;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the no of elements of TreeMap: ");
			n=sc.nextInt();
			System.out.println("Enter customername and phonenumber in TreeMap : ");
			for(int i=0;i<n;i++) {
				String a=sc.next();
				int b=sc.nextInt();
				tmap.put(a,b);
			}
			display(tmap);
			System.out.println("\nTo retrive number for specified Name: ");
			String s1=sc.next();
			if(tmap.containsKey(s1))
			{
			 System.out.println("PhoneNumber: "+tmap.get(s1));
			}
			else
			{
				System.out.println("Customer Name not Found...");
			}
			System.out.println("\nTo specify number for given cusotmer name: ");
			String s=sc.next();
			if(tmap.containsKey(s))
			{
			System.out.println("Old PhoneNumber:"+tmap.get(s));
			tmap.replace(s, 988888522);
			System.out.println("Updated PhoneNumber: "+tmap.get(s));
			System.out.println("\nDirectory (Post Updation): ");
			display(tmap);
			}
			else {
				System.out.println(" Customer Name not Found...");
			}
			sc.close();		
		}
	
}

