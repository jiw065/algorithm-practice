/**
 * Leetcode 700 
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class SearchBST {
	  public TreeNode searchBST(TreeNode root, int val) {
	        if (root == null){
	            return null;
	        }
	        TreeNode a =null; 
	        if(root.val == val){  
	            a = root; 
	            return a; 
	        }
	          a = searchBST(root.left, val);
	          if(a!=null){
	              return a;
	          }
	          a = searchBST(root.right, val);    
	          if(a!=null){
	              return a;
	          } 
	        
	        return a; 
	    }
}
