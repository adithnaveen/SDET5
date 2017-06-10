package com.fannie.day3;

import java.util.LinkedList;
import java.util.Queue;

public class ListEx4 {
	public static void main(String[] args) {
		Queue<String> q  = new LinkedList<String>();
		
		q.offer("first");
		q.offer("second");
		q.offer("third");
		q.offer("fourth");
		
		System.out.println(q);
		q.poll();
		q.poll();
		System.out.println(q);
	
		System.out.println(q.peek());
		System.out.println(q.peek());
		System.out.println(q.peek());
		System.out.println(q.peek());
		
		System.out.println(q);
		q.offer("Fifth");
		
		System.out.println(q);
		
	}
}
