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
    public int sumNumbers(TreeNode root) {
        if(root==null) return 0;
        int sum = sumNumbersUtil(root, 0);
        return sum;
    }
    int sumNumbersUtil(TreeNode root, int sum) {
        if(root == null) return 0;
        sum=sum*10+root.val;
        if(root.left==null && root.right == null) return sum;
        return sumNumbersUtil(root.left, sum) + sumNumbersUtil(root.right, sum);
    }
}