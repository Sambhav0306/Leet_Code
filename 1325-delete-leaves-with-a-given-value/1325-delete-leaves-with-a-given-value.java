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
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        TreeNode node=f(root,target);
        return node;
    }
    public TreeNode f(TreeNode node,int t){
        if(node==null ) return null;
        node.left=f(node.left,t);
        node.right=f(node.right,t);
        if(node.left==null && node.right==null && node.val==t){
            node=null;
        }
        return node;
    }
}