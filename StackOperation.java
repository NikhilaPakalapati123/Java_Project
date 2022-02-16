package com.concept.oops;

import java.util.Scanner;
import java.util.Stack;

public class StackOperation {
	public static void main(String[] args) {
		Stack<Integer> stack= new Stack<Integer>();
		//checking stack status 
		boolean result = stack.empty();
		System.out.println(result);
		int n;
		int e;
		//taking stack size
		Scanner s=new Scanner(System.in);  
		System.out.println("Enter No of Elements: ");  
		n=s.nextInt(); 
		//taking elements to stack
		System.out.println("Enter the elements: ");
		
		
		for(int i=0; i<n; i++)  
		{     
			stack.push(s.nextInt());  
		}
		//stack operations
		System.out.println("stack elements are:" +stack);
		System.out.println("pop element:"+stack.pop());
		System.out.println("stack elements are:" +stack);
		System.out.println("peek element:"+stack.peek());
		System.out.println("Enter No for search:");  
		e=s.nextInt();
		System.out.println("search element:"+stack.search(e));
		System.out.println("check stack:"+stack.empty());
		System.out.println("check stack:"+stack.size());
	}

}
