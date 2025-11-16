package test;

import Queue.QueueUsingLinkedList;
import Queue.circularqueue;
import Stack.StackUsingArray;

public class TestStackArray {

	public static void main(String[] args) {
		StackUsingArray sc=new StackUsingArray(5);
		sc.push(10);
		sc.push(20);
		sc.push(30);
		sc.push(40);
		sc.push(50);
		
		System.out.println(sc.pop());
		System.out.println(sc.pop());
		System.out.println(sc.pop());
		System.out.println(sc.pop());
		System.out.println(sc.pop());
		
		QueueUsingLinkedList ql=new QueueUsingLinkedList();
		ql.enqueue(2);
		ql.enqueue(4);
		ql.enqueue(6);
		ql.enqueue(8);
		ql.enqueue(10);
		
		System.out.println(ql.dequeue());
		System.out.println(ql.dequeue());
		System.out.println(ql.dequeue());
		System.out.println(ql.dequeue());
		System.out.println(ql.dequeue());
		
		circularqueue cq=new circularqueue(3);
		cq.enqueue(9);
		cq.enqueue(8);
		cq.enqueue(7);
		
		System.out.println(cq.dequeue());
		System.out.println(cq.dequeue());
		

	}

}
