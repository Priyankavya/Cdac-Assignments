package Test;

import LinkedList.SinglyLinkedList;

public class TestSinglyLinkedList {

	public static void main(String[] args) {
	
		SinglyLinkedList slist=new SinglyLinkedList();

		
		slist.addNode(5);
		slist.addNode(50);
		slist.addNode(40);
		slist.addNode(10);
		
		slist.addAftergiveNum(50, 80);
		slist.display();
		slist.addAtPos(2, 30);
		slist.display();
		slist.deleteByValue(5);
		slist.display();
		slist.deleteByPos(4);
		slist.display();
		
		slist.addBeforeVal(50, 20);
		slist.display();
		//slist.displayreverse();
		//slist.deleteallprimes();
		//slist.display();
		//slist.reverse();
		
		//slist.AddByPosition();
	}

}
