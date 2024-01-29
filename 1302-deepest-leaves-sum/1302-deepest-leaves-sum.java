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
    public int deepestLeavesSum(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null){
            return 0;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            ArrayList<Integer> list1=new ArrayList<>();
            int size=queue.size();
            for(int i=0;i<size;i++){
                if(queue.peek().left!=null){
                    queue.offer(queue.peek().left);
                }
                if(queue.peek().right!=null){
                    queue.offer(queue.peek().right);
                }
                list1.add(queue.poll().val);
            }
            list.add(list1);
        }
        int sum=0;
        int i=list.size()-1;
        for(int j=0;j<list.get(i).size();j++){
            sum+=list.get(i).get(j);
        }
        return sum;
    }
}