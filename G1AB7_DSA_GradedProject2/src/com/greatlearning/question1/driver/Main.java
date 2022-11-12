package com.greatlearning.question1.driver;
import com.greatlearning.question1.service.SkyScraper;
import java.util.Scanner;
import java.util.Stack;

public class Main 
{
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		Stack<Integer> stk = new Stack<>();

		// total floors

		System.out.println("Enter the total no of floors in the building: ");
		int size = sc.nextInt();
		SkyScraper s = new SkyScraper(size);

		// floor manufactured on each construction day

		for (int i = 0; i < size; i++) 
		{
			System.out.println("Enter the floor size given on day " + (i + 1) + ": ");
			s.enQueue(sc.nextInt());
		}

		System.out.println("\nThe order of construction is as follows: \n");
		int key = 0, j = 1, max = size;

		// pushing elements into stack

		for (int i = 0; i < size; i++)
		{
			key = s.deQueue();
			s.updatePointers();
			stk.push(key);
			if (key == max) 
			{
				System.out.println("Day " + j + ": ");
				while (stk.peek() == max) 
				{
					System.out.print(" " + stk.pop());
					max--;
					if (stk.empty())
					{
						break;
					}
				}
				j++;
				System.out.println();
			} 
			else 
			{
				System.out.println("Day " + j + ": ");
				j++;
			}
		}
		sc.close();
	}
}


