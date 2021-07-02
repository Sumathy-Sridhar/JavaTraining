package com.srm.JavaDay10;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AccountInfo {
	public static void display(TreeMap<Integer,Double> tmap)
	{
		for(Map.Entry<Integer,Double> e:tmap.entrySet())
		{
			System.out.println("Account Number: "+e.getKey()+" Balance: "+e.getValue());
		}	
	}
		public static void main(String[] args) {
		TreeMap<Integer,Double> tmap=new TreeMap<Integer,Double>();
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of accounts of TreeMap: ");
		n=sc.nextInt();
		System.out.println("Enter AccountNumber and Balance in TreeMap : ");
		for(int i=0;i<n;i++) {
			System.out.println("Enter Account number: ");
			int a=sc.nextInt();
			System.out.println("Enter Balance: ");
			double b=sc.nextDouble();
			tmap.put(a,b);
		}
		display(tmap);
		System.out.println(" \n Enter Account Nunmber: ");
		int a=sc.nextInt();
		if(tmap.containsKey(a))
		{
			System.out.println(" \n Account balance("+a+"): "+tmap.get(a));
		}
		else
		{
			System.out.println("\n No such account exist...");
		}
	sc.close();
		}
		
	}


