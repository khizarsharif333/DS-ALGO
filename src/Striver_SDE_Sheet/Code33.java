package Striver_SDE_Sheet;

import java.util.List;

public class Code33 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || k==1) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode pre = dummy,cur = dummy,nex = dummy;

        int count =0;
        while(cur.next!=null){
            cur = cur.next;
            count++;
        }
        while(count>=k) {
            cur = pre.next;
            nex = cur.next;
            for (int i = 1; i < k; i++) {
                cur.next = nex.next;
                nex.next = pre.next;
                pre.next = nex;
                nex = cur.next;
            }
            count-=k;
            pre = cur;
        }
        return dummy.next;
    }
}
