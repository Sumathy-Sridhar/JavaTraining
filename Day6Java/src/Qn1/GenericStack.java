package Qn1;

import java.util.Stack;

public class GenericStack {
    static void PushFn(Stack<Integer> stack)
    {
        for(int i = 10; i < 25; i++)
        {
            stack.push(i);
        }
        System.out.println(stack);
    }
    
	/*
	 * static void PopFn(Stack<Integer> stack) {
	 * System.out.println("Pop Operation:");
	 * 
	 * for(int i = 0; i < 5; i++) { Integer y = (Integer) stack.pop();
	 * System.out.println(y); } }
	 */  
    static void PeekFn(Stack<Integer> stack)
    {
        Integer element = (Integer) stack.peek();
        System.out.println("Element on stack top: " + element);
    }
    
    static void SearchStack(Stack<Integer> stack, int element)
    {
        Integer pos = (Integer) stack.search(element);
  
        if(pos == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element is found at position: " + pos);
    }
  
    public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		PushFn(stack);
		//PopFn(stack);
		PeekFn(stack);
		SearchStack(stack,3);
		SearchStack(stack,9);
	}
}
