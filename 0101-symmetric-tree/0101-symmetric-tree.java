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
    ArrayList<Integer> arr=new ArrayList<Integer>();
    ArrayList<Integer> arr1=new ArrayList<Integer>();
    public boolean isSymmetric(TreeNode root) {
        
        Inorder_left_right(root.left);
        Inorder_right_left(root.right);
        if(arr.equals(arr1)){
            return true;
        }
        return false;
    }

    public void Inorder_left_right(TreeNode root){
            if(root==null){
                arr.add(-1);
                return;
            }
            arr.add(root.val);
            Inorder_left_right(root.left);
            Inorder_left_right(root.right);
        }

    public void Inorder_right_left(TreeNode root){
        if(root==null){
            arr1.add(-1);
            return;
        }
        arr1.add(root.val);
        Inorder_right_left(root.right);
        Inorder_right_left(root.left);
    }
}