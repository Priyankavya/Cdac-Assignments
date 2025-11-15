package Test;

import LinkedList.SinglyLinkedList;

public class TestSinglyLinkedList {

	public static void main(String[] args) {
	
		SinglyLinkedList slist=new SinglyLinkedList();

		
		slist.AddNode(5);
		slist.AddNode(50);
		slist.AddNode(40);
		slist.AddNode(10);
		
		
		slist.Display();
		slist.deleteallprimes();
		slist.Display();
		//slist.reverse();
		
		//slist.AddByPosition();
	}

}
