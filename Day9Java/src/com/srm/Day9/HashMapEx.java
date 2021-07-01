package com.srm.Day9;
import java.util.*;
public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		int n;
		System.out.println("ENter no of elements for hashmap: ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Enter the Key and Value of HashMap : ");
		for(int i=0;i<n;i++) {
			int k=sc.nextInt();
			String val=sc.nextLine();
			hm.put(k,val);
		}
		System.out.println("Elements of HashMap: ");
		 for (Map.Entry<Integer,String> pair: hm.entrySet()) {
			  System.out.println("key: " +pair.getKey() +" Value: " + pair.getValue());
			}
	sc.close();
	}
	

}
