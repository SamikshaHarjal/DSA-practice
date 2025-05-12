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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode cur=head;
        int len=0,z=0;
        while(cur!=null){
            len++;
            cur=cur.next;
        }
        int arr[]=new int[len];
        cur=head;
        while(cur!=null){
            arr[z++]=cur.val;
            cur=cur.next;
        }
        for(int i=0;i<len;i++){
            if(i+k-1>=len){
                break;
            }
            int r=i+k-1;
            int l=i;
            while(l<r){
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;r--;
            }
            i+=k-1;
        }
        cur=head;z=0;
        while(cur!=null){
cur.val=arr[z++];
cur=cur.next;
        }
        return head;
    }
}