package com.srm.JavaTraining;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListConcat {

	public static void main(String[] args) {
		LinkedList<Integer> linklist1=new LinkedList<Integer>();
		LinkedList<Integer> linklist2=new LinkedList<Integer>();
		LinkedList<Integer> linklist3=new LinkedList<Integer>();
		int n1, n2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Elements for LinkedList 1: ");
		 n1=sc.nextInt();
		 System.out.println("Enter the LinkedList 1 Elements:  ");
		for(int i=0;i<n1;i++){
		int a=sc.nextInt();
		linklist1.add(a);
		}
		System.out.println("Elements of Linked List 1: ");
		System.out.println(linklist1);
		System.out.println("Enter the number of Elements for LinkedList 2: ");
		 n2=sc.nextInt();
		 System.out.println("Enter the LinkedList 2 Elements:  ");
		for(int i=0;i<n2;i++){
		int a=sc.nextInt();
		linklist2.add(a);
		}
		System.out.println("Elements of Linked List 2: ");
		System.out.println(linklist2);
		System.out.println(" ");
		System.out.println("Concatenation of LinkedList 1 and LinkedLsit 2...");
		linklist3.addAll(linklist1);
		linklist3.addAll(linklist2);
		System.out.println("Elements of Concatenated LinkedList : ");
		System.out.println(linklist3);
		sc.close();

	}

}
