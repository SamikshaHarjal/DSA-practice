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
    public ListNode mergeKLists(ListNode[] lists) {
        int len=0;
        for(ListNode l:lists){
            while(l!=null){
                l=l.next;
                len++;
            }
        }
        int []arr=new int [len];
        int z=0;
        for(ListNode l:lists){
            while(l!=null){
                arr[z++]=l.val;
                l=l.next;               
            }

        }
        Arrays.sort(arr);
        ListNode dummy=new ListNode(0);
        ListNode current=dummy;
        for(int i=0;i<arr.length;i++){
           current.next=new ListNode(arr[i]);
           current=current.next;
           
        }
return dummy.next;
    }
}