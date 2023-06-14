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
    public int getMinimumDifference(TreeNode root) {
     ArrayList<Integer> list=new ArrayList<>();
     inorder(root,list);
        int min=100000;
        for(int i=0;i<list.size()-1;i++){
            if(min>list.get(i+1)-list.get(i)){
                min=list.get(i+1)-list.get(i);
            }
        }
        return min;
    }
    private void inorder(TreeNode root,ArrayList<Integer> list){
        if(root==null){
            return;
        }
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }
}