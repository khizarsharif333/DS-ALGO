package Striver_SDE_Sheet;

public class Code32 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    // TC-O(N) SC-O(1)
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null) return false;
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow) return true;
        }
        return false;
    }
}
