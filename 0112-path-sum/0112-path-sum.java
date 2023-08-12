/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        Queue<TreeNode> q=new LinkedList<>();
        int k=0;
        if(root==null){
            return false;
        }
        if(f(root,sum,k)) return true;
        return false;
    }
    public boolean f(TreeNode node,int sum,int k){
        if(node==null){
            return false;
        }
        k+=node.val;
        if(node.right==null && node.left==null ){
            if(k==sum)return true;
            return false;
        }
        boolean left=f(node.left,sum,k);
        boolean right=f(node.right,sum,k);
        return right||left;
    }
}