package Binary;

public class BinarySearchTree {
	
	Node root;
	class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int data)
		{
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	
	public BinarySearchTree()
	{
		root=null;
	}
	
	public void insertNode(int key)
	{
		root=insertData(root,key);
	}

	private Node insertData(Node root, int key) {
		Node newNode =new Node(key);
		if(root==null)
		{
			root=newNode;
			return root;
		}
		
		else
		{
			if(key<root.data)
			{
				root.left=insertData(root.left, key);
				
			}
			else
			{
				root.right=insertData(root.right, key);
			}
			
			return root;
		}
		
	}
	
	public void inorder()
	{
		inordertraversal(root);
		System.out.println();
	}

	private void inordertraversal(Node root) {
		if(root!=null)
		{
			inordertraversal(root.left);
			System.out.println(root.data);
			inordertraversal(root.right);
		}
		
	}
	
	public void preorder()
	{
		preordertraversal(root);
		System.out.println();
	}

	private void preordertraversal(Node root) {
		
		if(root!=null)
		{
			System.out.println(root.data);
			preordertraversal(root.left);
			preordertraversal(root.right);
		}
		
	}
	
	
	public void postorder()
	{
		postordertraversal(root);
		System.out.println();
	}

	private void postordertraversal(Node root) {
		if(root!=null)
		{
		postordertraversal(root.left);
		postordertraversal(root.right);
		System.out.println(root.data);
		}
	}
	
	public void deleteNode(int key)
	{
		root=deleteData(root,key);
		
	}

	private Node deleteData(Node root, int key) {
		
		if(root==null) {
			return root;
		}
		if(key<root.data)
		{
			root.left=deleteData(root.left, key);
		}
		else if(key>root.data)
		{
			root.right=deleteData(root.right, key);
			
		}
		
		else
		{
			if(root.left==null && root.right==null)
			{
				return null;
			}
			else if(root.left==null)
			{
				return root.right;
			}
			else if(root.right==null)
			{
				return root.left;
			}
			
			root.data=minval(root.right);
			root.right=deleteData(root.right, root.data);
			
		}
		return root;
	}

	private int minval(Node root) {

		int min=root.data;
		
		while(root.left!=null)
		{
			min=root.left.data;
			root=root.left;
		}
		return min;
	}
	
	public boolean searchBinaryTree(int key)
	{
		return searchinbnary(root,key);
	}

	private boolean searchinbnary(Node root, int key) {
		if(root!=null)
		{
		if(root.data==key)
		{
			System.out.println("data found");
			return true;
		}
		else if(key<root.data)
		{
			return searchinbnary(root.left, key);
		}
		else
		{
			return searchinbnary(root.right, key);
		}
		}
		
		System.out.println("not found");
		return false;
	}

}
