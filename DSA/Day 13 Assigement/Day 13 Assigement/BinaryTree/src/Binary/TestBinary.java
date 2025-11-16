package Binary;

public class TestBinary {
	public static void main(String args[])
	{
	   BinarySearchTree bst=new BinarySearchTree();
	   bst.insertNode(10);
	   bst.insertNode(12);
	   bst.insertNode(5);
	   bst.insertNode(11);
	   bst.insertNode(2);
	   bst.insertNode(9);
	   
	   bst.preorder();
	   bst.inorder();
	   bst.postorder();
	   bst.deleteNode(12);
	   bst.searchBinaryTree(12);
	   
	}
	

}
