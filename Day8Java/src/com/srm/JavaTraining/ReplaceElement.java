package com.srm.JavaTraining;

import java.util.*;

public class ReplaceElement {

	public static void main(String[] args) {
		try {
			ArrayList<Integer> ar = new ArrayList<Integer>();
			int n;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of Elements for Arraylist: ");
			n = sc.nextInt();
			System.out.println("Enter ArrayList Elements: ");
			for (int i = 1; i <=n; i++) {
				int a = sc.nextInt();
				ar.add(a);
			}
			System.out.println("ArrayList: ");
			System.out.println(ar);
			ar.set(2, 20);
		System.out.println("ArrayLsit after Replacing Elements :");
			System.out.println(ar);
			ar.set(10, 80);
			sc.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
