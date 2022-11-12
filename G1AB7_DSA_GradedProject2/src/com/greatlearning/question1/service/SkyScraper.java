package com.greatlearning.question1.service;
import com.greatlearning.question1.model.Queue;

public class SkyScraper extends Queue 
{
	public SkyScraper(int sizeOfQueue)
	{
		super(sizeOfQueue);
	}

	public boolean isFull() 
	{
		if (rear == maxSize - 1) 
		{
			return true;
		}
		return false;
	}

	public boolean isEmpty()
	{
		if (front == -1)
		{
			return true;
		}
		return false;
	}

	public void enQueue(int data)
	{
		if (!isFull())
		{
			rear++;
			arr[rear] = data;
			if (front == -1)
				front = 0;
		}
		else
		{
			System.out.println("Queue overflow");
		}
	}

	public int deQueue()
	{
		if (isEmpty()) 
		{
			System.out.println("queue underflow");
			return 0;
		} 
		else
		{
			return arr[front];
		}

	}

	public void updatePointers() 
	{
		if (front == rear)
		{
			front = -1;
			rear = -1;
		}
		else
		{
			front++;
		}
	}
}



