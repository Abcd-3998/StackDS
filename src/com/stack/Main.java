package com.stack;


public class Main {

	public static void main(String[] args) {
		Stack s1=new Stack();
		s1.push(4);
		s1.push(5);
		s1.push(6);
		s1.push(7);
		s1.push(8);
		s1.push(9);
		s1.push(71);
		s1.push(2);
		s1.push(10);
		s1.push(20);
		s1.push(2);
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
	}

}
