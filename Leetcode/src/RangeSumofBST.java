/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class RangeSumofBST {
	 public int travel(TreeNode n,int sum, int L, int R){
	        int num = sum;
	        if (n == null ){
	            return num; 
	        }   
	            if(n.val >=L && n.val<= R ){
	                num += n.val; 
	            }
	            
	          num += travel(n.left,sum,L,R);
	          num += travel(n.right,sum,L,R);
	        
	       return num; 
	    }
	    
	    public int rangeSumBST(TreeNode root, int L, int R) {
	        
	        int sum = 0;
	        return travel(root,sum, L, R);
	        
	    }
}
