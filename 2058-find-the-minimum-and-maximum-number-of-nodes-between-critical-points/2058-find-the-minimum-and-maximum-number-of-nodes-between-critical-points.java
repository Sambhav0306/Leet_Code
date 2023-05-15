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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head==null ||head.next==null){
            return new int[]{-1,-1};
        }
        ArrayList<Integer> list=new ArrayList<>();
        ListNode node=head;
        int n=1;
        while(node.next.next!=null){
            if(node.val>node.next.val && node.next.next.val>node.next.val){
                list.add(n+1);
            }else if(node.val<node.next.val && node.next.next.val<node.next.val){
                list.add(n+1);
            }
            node=node.next;
            n++;
        }
        Collections.sort(list);
        if(list.size()<2){
            return new int[]{-1,-1};
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<list.size()-1;i++){
            if(min>list.get(i+1)-list.get(i)){
                min=list.get(i+1)-list.get(i);
            }
        }
        return new int[]{min,list.get(list.size()-1)-list.get(0)};
    }
}