package Test;

import LinkedList.DoublyLinkedList;

public class TestDoublyLinkedList {

	public static void main(String[] args) {
		DoublyLinkedList dl=new DoublyLinkedList();
		dl.addNode(20);
		dl.addNode(10);
		dl.addNode(20);
		dl.addNode(50);
		
		dl.display();
		dl.reverse();

	}

}
