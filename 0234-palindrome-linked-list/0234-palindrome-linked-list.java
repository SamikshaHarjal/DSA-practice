class Solution {
    public static ListNode head;
    public static ListNode tail;

    public void addFirst(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public static ListNode mid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static boolean isPalindrome(ListNode head) {
        //  Step1: find out mid
        ListNode midNode = mid(head);
        //  Step2: reverse 2nd half
        ListNode prev = null;
        ListNode curr = midNode;
        ListNode next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        //  step3: Compare the both half
        ListNode Left = head;
        ListNode Right = prev;
        while(Right != null){
            if(Left.val != Right.val){
                 return false;
            }
            Left = Left.next;
            Right = Right.next;
        }
        return true;
    }

}