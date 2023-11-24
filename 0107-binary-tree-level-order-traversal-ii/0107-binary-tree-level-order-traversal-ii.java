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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        if(root==null) return list;
        Queue<TreeNode> queue=new LinkedList();
        queue.offer(root);
        while(queue.size()!=0){
            int k=queue.size();
            List<Integer> list1=new ArrayList<>();
            while(k!=0){
                TreeNode node=queue.poll();
                list1.add(node.val);
                if(node.left!=null) queue.offer(node.left);
                if(node.right!=null) queue.offer(node.right);
                k--;
            }
            list.add(new ArrayList<>(list1));
        }
        Collections.reverse(list);
        return list;
    }
}