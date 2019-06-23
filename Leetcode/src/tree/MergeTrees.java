package tree;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class MergeTrees {
	 public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
	       
	        if(t1==null && t2==null){
	            return t1;
	        }

	        if(t1== null && t2 != null){
	            t1 = t2;
	            return t1; 
	        }else if (t1 != null && t2 == null){
	            t1.val = t1.val;
	        }else{
	            t1.val =(t1.val+t2.val); 
	        }
	        
	        TreeNode t1Left = null;
	        TreeNode t1Right = null;
	        TreeNode t2Left = null;
	        TreeNode t2Right = null; 
	        if (t1 != null){
	            t1Left = t1.left;
	            t1Right = t1.right;     
	        }
	        if (t2 != null){
	            t2Left = t2.left;
	            t2Right = t2.right;     
	        }
	        
	        t1.left = mergeTrees(t1Left, t2Left);
	        t1.right = mergeTrees(t1Right, t2Right);
	        return t1; 
	    }
}
