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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode cur=head;
        int count=0,z=0;
        while(cur!=null){
            cur=cur.next;
            count++;
        }
        cur=head;
        int []arr=new int[count];
        while(cur!=null){
            arr[z++]=cur.val;
            cur=cur.next;
        }
    int l=left-1;
    int r=right-1;
    while(l<r){
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        l++;
        r--;
    }
    z=0;
    cur=head;
    while(cur!=null){
        cur.val=arr[z++];
        cur=cur.next;
    }
    
    return head;
    }
}