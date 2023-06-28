package com.stack;

public class Stack {
	int[] stack=new int[10];
	int tos;
	Stack()
	{
		tos=-1;
	}
	public void push(int val)
	{
		if(tos==9)
		{
			System.out.println("stack is full !! ");
		}
		tos=tos+1;
		stack[tos]=val;
		
	}
	public int pop()
	{
		if(tos>=0)
		{
			return stack[tos--];
		}
		else
		{
			System.out.println("stack is empty ");
			return -1;
		}
		
		
	}

}
