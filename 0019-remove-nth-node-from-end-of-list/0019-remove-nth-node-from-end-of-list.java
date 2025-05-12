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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null){
            return null;
        }
        
        ListNode cur=head;
        int size=1;
        while(cur!=null){
             if(n==1){
                if(cur.next.next==null){
                    cur.next=cur.next.next;
                }
            }
            size++;
            cur=cur.next;
           
        }
        int index=size-n;
        size=1;
                cur=head;
        while(cur!=null&&cur.next!=null){
        
            if(size==index){
            
                cur.val=cur.next.val;
                cur.next=cur.next.next;
            }
            else{cur=cur.next;}
            size++;
        }return head;
    }
}