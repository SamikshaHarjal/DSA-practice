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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur=head;
        itt(cur);
        return head;
    }
    public void itt(ListNode cur){
if(cur==null||cur.next==null){
    return;
}
if(cur.val==cur.next.val){
    cur.next=cur.next.next;
}
else{
    cur=cur.next;
}
itt(cur);
    }
}