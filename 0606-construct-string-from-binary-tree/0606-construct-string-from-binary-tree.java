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
    StringBuilder str=new StringBuilder();
    public String tree2str(TreeNode root) {
        str.append(root.val);
        f(root);
        return str.toString();
    }
    public void f(TreeNode node){
        if(node.left==null && node.right==null) return;
        if(node.left==null){
            str.append('('); 
            str.append(')'); 
        }else{
            str.append('('); 
            str.append(node.left.val);
            f(node.left);
            str.append(')'); 
        }
        if(node.right!=null){
            str.append('('); 
            str.append(node.right.val);
            f(node.right);
            str.append(')');
        }
    }
}