package com.srm.JavaDay10;
import java.util.*;
public class CollAlgorithms {

	public static void main(String[] args) {
		ArrayList<Integer> arrlist=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of ArrayList: ");
		int n=sc.nextInt();
		System.out.println("Enter the Elements: ");
	    for(int i=0;i<n;i++)
	    { 
	    	arrlist.add(sc.nextInt());
	    }
	    System.out.println("The ArrayList: "+arrlist);
	    Collections.reverse(arrlist);
	    System.out.println("Reversed ArrayList: "+arrlist);
	    Collections.shuffle(arrlist);
	    System.out.println("Shuffled ArrayList: "+arrlist);
	    System.out.println("Maximum Element: "+Collections.max(arrlist));
	    System.out.println("Minimum Element: "+Collections.min(arrlist));
	    System.out.println("Enter a element to Perform Binary Search: ");
	    int num=sc.nextInt();
	    Collections.sort(arrlist);
	    System.out.println("Index of Element: "+Collections.binarySearch(arrlist,num));//if element not present na it will return(-(insertion position)-1)
	sc.close();
	}
	

	}


