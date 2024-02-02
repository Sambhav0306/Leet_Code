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
    public int goodNodes(TreeNode root) {
        return f(root,root.val);
    }
    public int f(TreeNode node,int max){
        if(node.right==null && node.left==null){
            if(node.val>=max) return 1;
            return 0;
        }
        int val=node.val;
        int right=0;
        int left=0;
        if(node.right!=null) right=f(node.right,Math.max(val,max));
        if(node.left!=null) left=f(node.left,Math.max(val,max));
        if(val>=max) return 1+left+right;
        return left+right;
    }
}