package com.concept.oops;

import java.util.Scanner;

public class Ary {

	public static void main(String[] args) {
		
		int count1=0;
		int n;  
		Scanner sc=new Scanner(System.in);
		//taking no of elements as input
		System.out.println("Enter No of Elements: ");  
		n=sc.nextInt();    
		int[] array = new int[n];  
		//taking each element to array 
		System.out.println("Enter the elements: ");
		
		int output=0;
		
		for(int i=0; i<n; i++)  
		{     
			//taking elements to array
			array[i]=sc.nextInt();  
		}
		//running loop for each element
		for (int arr:array)
		{
			int count=0;
			for (int ar:array)
			{
				if (arr%ar==0)
				{
					count+=1;
				}
			}
			//comparing no of divisors 
			if (count>count1)
			{
				count1=count;
				//taking highest no of divisors element in the array
				output=arr;
				
			}
		}
		System.out.println("Most number of divisors element in the arrray"+ output);
		

	}

}
