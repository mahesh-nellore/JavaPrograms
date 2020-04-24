package datastructure;

class TreeNode{
	int key;
	TreeNode left, right;
	
	public TreeNode(int key) {
		this.key = key;
		left = right = null;
	}
	
}

public class BinaryTree {
	
	TreeNode root;
	
	public BinaryTree() {
		root = null;
	}
	public BinaryTree(int key) {
		root = new TreeNode(key);
	}
	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		
		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(3);
		tree.root.left.left = new TreeNode(4);
	}
}
