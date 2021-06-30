package com.srm.JavaTraining;
import java.util.*;


public class ArrayListMinMax {

	public static void main(String[] args) {
		ArrayList<Integer> ar=new ArrayList<Integer>();
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Elements for Arraylist: ");
		 n=sc.nextInt();
		 System.out.println("Enter the ArrayList Elements:  ");
		for(int i=0;i<n;i++){
		int a=sc.nextInt();
		ar.add(a);
		}
		System.out.println(ar);
		System.out.println("Minimum value of ArrayList: "+Collections.min(ar));
		      System.out.println("Maximum Value of ArrayList: "+Collections.max(ar));

sc.close();
	}

}
