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
    public ListNode middleNode(ListNode head) {
        ListNode x2= head;
        ListNode x1=head;
        while(x2!=null&&x2.next!=null){
x1=x1.next;
x2=x2.next.next;
        }
        return x1;
    }
}