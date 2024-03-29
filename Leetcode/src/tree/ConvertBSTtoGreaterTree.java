package tree;

public class ConvertBSTtoGreaterTree {
	 int sum = 0; 
	    public TreeNode convertBST(TreeNode root) {
	        if(root == null){
	            return null;
	        }
	        
	        root.right = convertBST(root.right);
	        sum += root.val;
	        root.val = sum; 
	        root.left = convertBST(root.left);
	       
	        
	        return root; 
	        
	    }
}
