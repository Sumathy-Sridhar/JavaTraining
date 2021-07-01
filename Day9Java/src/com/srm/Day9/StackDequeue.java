package com.srm.Day9;

import java.util.*;

public class StackDequeue {

	public static void main(String[] args) {
		Deque<Integer> st = new ArrayDeque<Integer>();
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements for stack: ");
		n = sc.nextInt();
		System.out.println("Enter Elements of Stack: ");
		for (int i = 0; i < n; i++) {
			int ele = sc.nextInt();
			st.push(ele);
		}
		System.out.println(st);
		System.out.println("Current element at the top of stack: " + st.peek());
		System.out.println("element removed from the stack: " + st.pop());
		System.out.println(" ");
		System.out.println("Iterating the Stack using isEmpty(): ");
		while (!st.isEmpty()) {
			System.out.println(st.pop());
		}

		sc.close();
	}

}
