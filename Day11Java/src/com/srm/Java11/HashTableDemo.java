package com.srm.Java11;
import java.util.*;
public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		boolean check=ht.isEmpty();
		int n;
		System.out.println("Is hash Table Empty: "+check);
		System.out.println("Enter the no of elemets for hashtable: ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter Key: ");
			int a=sc.nextInt();
			System.out.println("Enter value: ");
			String str=sc.next();
			ht.put(a, str);
		}
		System.out.println("Elements of HashTbale: "+ht);
		System.out.println("Size of HashTable: "+ht.size());
		System.out.println("Enter key to retrieve value: ");
		int searchkey=sc.nextInt();
		System.out.println("Value of Key "+searchkey+ " is : "+ht.get(searchkey));
		System.out.println("Replacing value of Key 2: "+ht.replace(2, "replace"));
		System.out.println("Updated HAshtable after replacing: "+ht);
		System.out.println("Check if the Hashtable contains the Key: "+ht.containsKey(4));
		System.out.println("Check if the Hashtable contains the value: "+ht.containsValue("sumi"));
		System.out.println("Remove value at key 4: "+ht.remove(4));
		System.out.println("HashTable after removing value at index 4: "+ht);
		sc.close();
	}

}
