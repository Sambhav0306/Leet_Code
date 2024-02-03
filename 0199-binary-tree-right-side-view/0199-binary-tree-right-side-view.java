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
    public List<Integer> rightSideView(TreeNode root) {
        List<List<Integer>> list=levelOrder(root);
        List<Integer> list1=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            list1.add(list.get(i).get(list.get(i).size()-1));
        }
        return list1;
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null){
            return list;
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
        return list;
    }
}