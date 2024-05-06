/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNodes(ListNode head) {
       Stack<Integer> stack=new Stack<>();
       ListNode node=head;
       while(node!=null){
           while(!stack.isEmpty() && stack.peek()<node.val){
               stack.pop();
           }
           stack.push(node.val);
           node=node.next;
       }
       int[] arr=new int[stack.size()];
       for(int i=arr.length-1;i>=0;i--){
           arr[i]=stack.peek();
           stack.pop();
       }
       node=head;
       int j=0;
       while(j<arr.length){
           node.val=arr[j];
           j++;
           if(j==arr.length){
               break;
           }
           node=node.next;
       }
       if( node !=null){

           node.next=null;
       }
       return head;
    }
}