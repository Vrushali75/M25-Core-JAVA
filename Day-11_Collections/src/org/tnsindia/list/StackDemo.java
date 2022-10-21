package org.tnsindia.list;

import java.util.Stack;
//Demo on stack -LIFO
public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer>s=new Stack<>();
		//push for insertion
		s.push(1);
		s.push(5);
		s.push(7);
		System.out.println(s);
		//pop for deletion
		s.pop();
		s.remove(0);//it deletes the 0th index element
		System.out.println(s);

	}

}
