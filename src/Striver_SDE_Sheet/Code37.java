package Striver_SDE_Sheet;

public class Code37 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0) return head;
        ListNode cur = head;
        int count =1;
        while(cur.next!=null){
            cur = cur.next;
            count++;
        }
        cur.next = head;
        k =k%count;
        k = count-k;
        while(k-- >0) cur = cur.next;
        head = cur.next;
        cur.next = null;
        return head;
    }
    // TC-O(K*N)
    public ListNode rotateRight1(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        for(int i=0;i<k;i++){
            ListNode pre = null;
            ListNode cur = head;
            while(cur.next!=null){
                pre = cur;
                cur = cur.next;
            }
            pre.next = null;
            cur.next = head;
            head = cur;
        }
        return head;
    }
}
