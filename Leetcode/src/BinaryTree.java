
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
	
	public BinaryTree(int[] data) {
		size = data.length;
		root = buildTree(0);
		this.data = data;
		
	}	
	
	public BinaryTree() {
		size = 0;
		root = buildTree();		
	}
	
// this is a 'balanced tree'
    public TreeNode buildTree(int index ) {
    	if (index >= size) {
    		return null; 
    	}
    	
    	TreeNode node = new TreeNode(data[index]);
    	node.left = buildTree(2*index+1);
    	node.right = buildTree(2*index+2);
    	return node;
    }
    
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
		BinaryTree t = new BinaryTree();
		t.preTravelTree(t.root); 
		System.out.println();
		t.inTravelTree(t.root);
		System.out.println();
		t.postTravelTree(t.root);

	}

}
