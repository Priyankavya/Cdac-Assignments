package Test;

import LinkedList.DoublyLinkedList;

public class TestDoublyLinkedList {

	public static void main(String[] args) {
		DoublyLinkedList dl=new DoublyLinkedList();
		dl.addNode(20);
		dl.addNode(10);
		dl.addNode(40);
		dl.addNode(50);
		
		dl.display();
		dl.addAfterValue(20, 30);
		dl.display();
		
		dl.addAfterValue(40, 60);
		dl.display();
		
		dl.addByPos(3, 8);
		dl.display();
		
		//dl.deleteByValue(40);
		//dl.display();
         dl.deleteByPos(2);
         dl.display();
		
		
		//dl.reverse();

	}

}
