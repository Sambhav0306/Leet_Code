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
    int count=0;
    HashMap<Integer,Integer> map=new HashMap<>();
    public int pseudoPalindromicPaths (TreeNode root) {
        f(root);
        return count;
    }
    public void f(TreeNode node){
        if(node.left==null && node.right==null){
            map.put(node.val,map.getOrDefault(node.val,0)+1);
            if(c()) count++;
            map.put(node.val,map.get(node.val)-1);
            if(map.get(node.val)==0) map.remove(node.val);
            return;
        }
        map.put(node.val,map.getOrDefault(node.val,0)+1);
        if(node.right!=null)f(node.right);
        if(node.left!=null)f(node.left);
        map.put(node.val,map.get(node.val)-1);
        if(map.get(node.val)==0) map.remove(node.val);
        return;
    }
    public boolean c(){
        boolean bool=false;
        int check=0;
        for(int i:map.keySet()){
            if(map.get(i)%2==1) check++;
            if(check>1) return false;
        }
        return true;
    }
}