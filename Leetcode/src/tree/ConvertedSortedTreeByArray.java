package tree;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class ConvertedSortedTreeByArray {
	  public TreeNode createLeftTree(int[] a, int num,int count){
	        int n = num;
	        if(n<0 ) {
	            return null;
	        }
	        TreeNode node = new TreeNode(a[n]);
	        count++;
	        node.left = createLeftTree(a, n-1*count,count);
	        node.right = createLeftTree( a, n-2*count,count);
	        
	        return node; 
	    }
	    
	   public TreeNode createRightTree(int[] a, int num, int count){
	        if(num > a.length-1 ){
	            return null;
	        }
	        TreeNode node = new TreeNode(a[num]);
	       count++; 
	        node.left = createRightTree(a, num+1*count, count);
	        node.right = createRightTree(a,num+2*count, count);
	        
	        return node; 
	    }
	    
	    
	    public TreeNode sortedArrayToBST1(int[] nums) {
	        if (nums.length == 0){
	            return null; 
	        }
	        int mid = nums.length/2;
	        TreeNode root = new TreeNode(nums[mid]);
	        root.left = createLeftTree(nums, mid-1,0);
	        root.right = createRightTree(nums,mid+1,0);
	 
	        return root; 
	        
	    }
}
