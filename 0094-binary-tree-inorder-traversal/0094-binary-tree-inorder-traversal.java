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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> array= new ArrayList<>();
        Stack<TreeNode> sk= new Stack<TreeNode>();
        TreeNode curr=root;
        if(root==null){
            return array;
        }
        while(true){
             if(curr!=null){
                 sk.push(curr);
                 curr=curr.left;
             }else{
                 if(sk.isEmpty()){
                     break;
                 }
                 curr=sk.pop();
                 array.add(curr.val);
                 curr=curr.right;
             }
             
        }
        return array;
    }
}