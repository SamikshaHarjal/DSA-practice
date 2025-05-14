/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A=headA;
        if(headA==null||headB==null){
            return null;
        }
        while(A!=null){
            ListNode B=headB;
            while(B!=null){
                if(A==B){
                    return A;
                }
                if(A.next==B.next){
                    return A.next;
                }

                B=B.next;
            }
            A=A.next;
        }return null;
    }
}