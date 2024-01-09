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
    
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        f(root1,list1);
        f(root2,list2);
        return list1.equals(list2);
            
    }
    public void f(TreeNode node,ArrayList<Integer> list){
        if (node != null) {
            if (node.left == null && node.right == null)
                list.add(node.val);
            f(node.left, list);
            f(node.right, list);
        }
    }
}