package com.srm.Day9;

import java.util.*;

public class IteratorDemo {

	public static void main(String[] args) {

		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements for ArrayList: ");
		n=sc.nextInt();
		System.out.println("Enter Elemenst of ArrayList : ");
		for(int i=0;i<n;i++){
			int ele=sc.nextInt();
			arrlist.add(ele);
		}
		System.out.println(arrlist );
		ListIterator<Integer> iterator = arrlist.listIterator(3);
		System.out.println("\nUsing ListIterator"
				+ " from Index :\n");
		while (iterator.hasNext()) {
			System.out.println("Value is : "
					+ iterator.next());
		}
		System.out.println("Iterating Elements of ArrayList using Iterator: ");
		Iterator<Integer> iterate = arrlist.iterator();
        while(iterate.hasNext()) {
        	System.out.println(iterate.next());
        }
        
sc.close();
	}

}
