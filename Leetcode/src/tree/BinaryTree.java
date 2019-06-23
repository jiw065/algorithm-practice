package tree;
import java.util.LinkedList;
import java.util.List;

public class BinaryTree {

	public class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	     
	}
	TreeNode root;
	int size;
	int[] data; 
	
	public BinaryTree(int[] a) {
		this.size = a.length;
		this.data = a.clone();
		this.root = buildTree(0);

	}	
	
	public BinaryTree() {
		size = 0;
		root = buildTree();		
	}
	
// dynamic Btree
    public TreeNode buildTree(int index ) {
    	if (index >= size) {
    		return null; 
    	}
    	//{10,9,20,15,35} 
    	TreeNode node = new TreeNode(this.data[index]);
    	node.left = buildTree(2*index+1);
    	node.right = buildTree(2*index+2);
    	//return root
    	return node;
    }
    //static Btree
    public TreeNode buildTree() {
    	//根节点-->10
        root = new TreeNode(10);
        //左孩子-->9
        root.left = new TreeNode(9);
        //右孩子-->20
        root.right = new TreeNode(20);        
        //20的左孩子-->15
        root.right.left = new TreeNode(15);       
        //20的右孩子-->35
        root.right.right = new TreeNode(35); 
        this.size = 5; 
        return root;
    }
    
    // root - left - right (10->9->20->15->35)
    public void preTravelTree(TreeNode node) {
    	if (node != null) {    	
    	 System.out.print(node.val+" ");
    	 preTravelTree(node.left);
    	 preTravelTree(node.right);
    	}
    }
    
    // left - root - right (9->10->15->20->35)
    public void inTravelTree(TreeNode node) {
    	if (node != null) {
    	 inTravelTree(node.left);
    	 System.out.print(node.val+" ");
    	 inTravelTree(node.right);
    	}
    }
    
    //left- right - root (9->15->35->20->10)
    public void postTravelTree(TreeNode node) {
    	if (node != null) {	
    	 postTravelTree(node.left);
    	 postTravelTree(node.right);
    	 System.out.print(node.val+" ");
    	}
    }
    

	public static void main(String[] args) {
		// static  Btree test
		BinaryTree t = new BinaryTree();
		t.preTravelTree(t.root); 
		System.out.println();
		t.inTravelTree(t.root);
		System.out.println();
		t.postTravelTree(t.root);
		System.out.println();
		
		//dynamic Btree Test 
		System.out.println("Dynamic Tree");

		int[] test = {10,9,20,15,35};
		BinaryTree dt = new BinaryTree(test);
		dt.preTravelTree(dt.root); 
		System.out.println();
		dt.inTravelTree(dt.root);
		System.out.println();
		dt.postTravelTree(dt.root);
	}

}
