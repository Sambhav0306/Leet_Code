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
    int c=0;
    public int pathSum(TreeNode root, int t) {
        if(root==null){
            return c;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode n= q.poll();
            sum(n, t, 0);
            if(n.left!=null)
                q.add(n.left);
            if(n.right!=null)
                q.add(n.right);
        }
        return c;
    }
    public void sum(TreeNode node, int t, long s){
        if(node!=null){
            s=s+node.val;
            if(t==s){
                c++;
            }
            sum(node.left, t, s);
            sum(node.right, t, s);
        }
    }
}