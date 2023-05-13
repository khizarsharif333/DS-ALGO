package Striver_SDE_Sheet;

import java.util.HashSet;

public class Code35 {
    class ListNode {
       int val;
       ListNode next;
       ListNode(int x) {
           val = x;
           next = null;
       }
    }
    // Naive
    public ListNode detectCycle1(ListNode head) {
        if(head==null || head.next==null) return null;
        HashSet<ListNode> set = new HashSet<>();
        ListNode dummy = head;
        while(dummy!=null){
            if(set.contains(dummy)) return dummy;
            set.add(dummy);
            dummy = dummy.next;
        }
        return null;
    }
    // Optimal
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null) return null;
        ListNode entry = head,slow = head,fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                while(entry!=slow){
                    slow = slow.next;
                    entry = entry.next;
                }
                return slow;
            }
        }
        return null;
    }
}
