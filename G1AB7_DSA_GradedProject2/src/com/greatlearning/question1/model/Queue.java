package com.greatlearning.question1.model;

public class Queue
{
	protected int maxSize;
	public int front;
	public int rear;
	public int arr[];

	public Queue(int sizeOfQueue)
	{
		this.maxSize = sizeOfQueue;
		front = -1;
		rear = -1;
		arr = new int[maxSize];
	}
}