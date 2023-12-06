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
    public long kthLargestLevelSum(TreeNode root, int o) {
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        List<Long> list=new ArrayList<>();
        while(queue.size()!=0){
            int k=queue.size();
            long a=0;
            while(k!=0){
                TreeNode node=queue.poll();
                if(node.right!=null) queue.offer(node.right);
                if(node.left!=null) queue.offer(node.left);
                k--;
                a+=node.val;
            }
            list.add(a);
        }
          if (list.size() < o) {
            return -1;
        }
        Collections.sort(list);
        return list.get(list.size()-o);
    }
}