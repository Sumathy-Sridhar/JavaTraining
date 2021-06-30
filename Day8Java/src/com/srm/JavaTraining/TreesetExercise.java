package com.srm.JavaTraining;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TreesetExercise {
	public static Integer RecursionSum(Integer rs)
	{ 
		if (rs <= 1)
		{
			return rs;
		}
		return rs + RecursionSum(rs - 1);	
	}

	public static void main(String[] args) {
		Set<Integer> ts=new TreeSet<Integer>();
		int n,sum=0,sumResult=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Elements for TreeSet: ");
		 n=sc.nextInt();
		 System.out.println("Enter the Treeset Elements:  ");
		for(int i=0;i<n;i++){
			int a=sc.nextInt();
			ts.add(a);
		}
		System.out.println("TreeSet Elements:	");
		System.out.println(ts);
        Iterator<Integer> iterate = ts.iterator();
        while(iterate.hasNext()) {
        	sum+=iterate.next();
        }
        System.out.println("Sum of TreeSet Elements using While loop Iterator :  "+sum);
		for(int forSum:ts)
	    {
	    	sumResult+=forSum;
	    }
		System.out.println("Sum of TreeSet Elements using For Loop:  "+sumResult);
		System.out.println("Sum of TreeSet Elements using Recursion:  ");
	    for (Integer i : ts) 
	    {
	    	System.out.println(RecursionSum(i));
	    }

sc.close();
	}

}
