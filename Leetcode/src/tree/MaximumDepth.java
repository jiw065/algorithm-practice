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
class Solution {
    public int findDepth (int sum, TreeNode root){
        int n = sum; 
        if (root == null){
            return n; 
        }
        n = n+1;
        n += Math.max(findDepth(0,root.left),findDepth(0,root.right));
        return n;         
    }
    public int maxDepth(TreeNode root) {
        int sum = 0;
        return findDepth(sum, root); 
    }
}