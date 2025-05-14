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
    public ListNode sortList(ListNode head) {
        if(head==null){
            return head;
        }
     int temp=0,i=0;
   List<Integer>li=new ArrayList<>();
   ListNode cur=head;
   while(cur!=null){
    li.add(cur.val);
cur=cur.next;
   }
   Collections.sort(li);
 cur=head;
   for(int val:li){
    cur.val=val;
    cur=cur.next;
   }
   return head;
    }
}