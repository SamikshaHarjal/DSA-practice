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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null|| head.next==null||k==0||k==0){
            return head;
        }
       
        ListNode cur=head;
        ListNode cur1=head;
int length=1;
while(cur.next!=null){
cur=cur.next;
 length++;
}
cur.next=head;
k=k%length;
k=length-k;

     
        while(k>0){
            cur=cur.next;
            k--;
        }
        head=cur.next;
        cur.next=null;
        return head;
    }
}