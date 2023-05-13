package Striver_SDE_Sheet;

import java.util.LinkedList;
public class Code28 {
    /*if(head==null){
        return head;
    }
        if(head.next==null){
        head=null;
        return head;
    }
    ListNode preNode=head;
    // ListNode nexNode;
    ListNode curNode = head;
    int k=1;
        while(curNode.next!=null){
        curNode=curNode.next;
        k++;
    }
        if(n==k){
        preNode=head.next;
        head=preNode;
        return head;
    }
    int i=k-n;
    curNode = head;
        for(int j=0;j<=i;j++){
        if(j+1==i){
            preNode=curNode;
        }
        if(j==i){
            preNode.next=curNode.next;
            break;
        }
        curNode=curNode.next;
    }
        return head;*/
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode removeNthFromEnd1(ListNode head, int n) {
        if(head==null || head.next==null) return null;
        ListNode dum = head;
        int count=0;
        while (dum != null) {
            dum = dum.next;
            count++;
        }
        if(n==count){
            return head.next;
        }
        ListNode dum1 = null;
        ListNode dum2 = head;
        for(int i=0;i<count;i++){
            if(i==count-n){
                dum1.next=dum2.next;
                break;
            }
            else{
                dum1 = dum2;
                dum2 = dum2.next;
            }
        }
        return head;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode() ;
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;
        for(int i=1;i<=n;i++) fast=fast.next;
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
