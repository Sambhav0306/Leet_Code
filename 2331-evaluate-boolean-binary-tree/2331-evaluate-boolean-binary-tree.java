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
    public boolean evaluateTree(TreeNode root) {
        if(root.val==0) return false;
        if(root.val==1) return true;
        f(root);
        if(root.val==0) return false;
        return true;
    }
    public void f(TreeNode root){
        if(root.left==null && root.right==null) return;
        f(root.left);
        f(root.right);
        {
            boolean left=false;
            boolean right=false;
            if(root.left.val==1) left=true;
            if(root.right.val==1) right=true;
            if(root.val==2){
                boolean ans=left|right;
                if(ans) root.val=1;
                else root.val=0;
            }else{
                boolean ans=left&right;
                if(ans) root.val=1;
                else root.val=0;
            }
        }
        return;
    }
}