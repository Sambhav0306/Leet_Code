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
    public void flatten(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();
        preorder(root,list);
        if(root==null){
            return;
        }
        root.left=null;
        TreeNode head=root;
        for(int i=1;i<list.size();i++){
            TreeNode node=new TreeNode(list.get(i),null,null);
            root.right=node;
            root=node;
        }
        root=head;
    }
    public void preorder(TreeNode root,ArrayList<Integer> list){
        if(root==null){
            return ;
        }
        list.add(root.val);
        preorder(root.left,list);
        preorder(root.right,list); 
    }
}