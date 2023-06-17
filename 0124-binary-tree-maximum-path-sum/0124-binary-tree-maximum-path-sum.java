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
    public int maxPathSum(TreeNode root) {
        int[] ans=new int[1];
        ans[0]=Integer.MIN_VALUE;
        answer(root,ans);
        return ans[0];
    }
    public int answer(TreeNode node,int[] ans){
        if(node==null){
            return 0;
        }
        int lf=Math.max(0,answer(node.left,ans));
        int rf=Math.max(0,answer(node.right,ans));
        ans[0]=Math.max((node.val+lf+rf),ans[0]);
        return node.val+ Math.max(lf,rf);
    }
}