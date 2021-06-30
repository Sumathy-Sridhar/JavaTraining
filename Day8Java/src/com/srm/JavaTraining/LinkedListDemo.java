package com.srm.JavaTraining;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<Integer>();
		int n,search,ind;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Elements for LinkedList: ");
		 n=sc.nextInt();
		 System.out.println("Enter the LinkedList Elements:  ");
		for(int i=0;i<n;i++){
		int a=sc.nextInt();
		ll.add(a);
		}
		System.out.println(ll);
		System.out.println("Enter the element to check if it exists in the LinkedList: ");
		search=sc.nextInt();
		ind=ll.indexOf(search);
			if(ind<0) {
				System.out.println("Search Element not found in the Linkedlist");
			}
			else {
				System.out.println("search Element found in the linkedlist at position : " +ind);
			}
		sc.close();
		
	}
}
