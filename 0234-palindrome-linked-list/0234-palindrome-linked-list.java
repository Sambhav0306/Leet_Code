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
    public ListNode middle(ListNode head){
        ListNode s=head;
        ListNode f= head;
        while(f!=null && f.next!= null){
            f=f.next.next;
            s=s.next;
        }
        return s;
    }
    public ListNode reverse(ListNode head){
        if(head==null){
            return head;
        }
        ListNode previous= null;
        ListNode present= head;
        ListNode next= present.next;
        while(present!= null){
            present.next= previous;
            previous=present;
            present=next;
            if(next!= null){
                next=next.next;
            }
        }
            return previous;
    }
    public boolean isPalindrome(ListNode head) {
          ListNode mid= middle(head);
          ListNode headSecond= reverse(mid);
          ListNode reverseHead= headSecond;
          while(head!= null &&  headSecond!=null){
              if(head.val!=headSecond.val){
                  break;
              }
              head=head.next;
              headSecond=headSecond.next;
          }
          reverse(reverseHead);
          if(head==null || headSecond==null){
              return true;
          }
          return false;
    }
}