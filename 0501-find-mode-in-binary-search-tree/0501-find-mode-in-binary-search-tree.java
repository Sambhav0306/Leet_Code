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
    HashMap<Integer,Integer> counter=new HashMap<>();
    public int[] findMode(TreeNode root) {
        f(root);
        int maxFreq = 0;
        for (int key : counter.keySet()) {
            maxFreq = Math.max(maxFreq, counter.get(key));
        }
        
        List<Integer> list = new ArrayList();
        for (int key : counter.keySet()) {
            if (counter.get(key) == maxFreq) {
                list.add(key);
            }
        }
        int[] arr=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
    public void f(TreeNode root){
        if(root==null) return;
        counter.put(root.val,counter.getOrDefault(root.val,0)+1);
        f(root.right);
        f(root.left);
    }
}