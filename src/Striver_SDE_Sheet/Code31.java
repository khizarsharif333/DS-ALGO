package Striver_SDE_Sheet;

import java.util.HashSet;

public class Code31 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    // BruteForce
    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<>();
        ListNode temp = headA;
        while(temp!=null){
            set.add(temp);
            temp = temp.next;
        }
        temp = headB;
        while(temp!=null){
            if(set.contains(temp)){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
    // TC-O(2M) SC-O(1)
    public ListNode getIntersectionNode0(ListNode headA, ListNode headB) {
        ListNode d1 = headA;
        int c1 =0,c2=0;
        ListNode d2 = headB;
        while(d1!=null || d2!=null){
            if(d1!=null){
                c1++;
                d1 = d1.next;
            }
            if(d2!=null){
                c2++;
                d2 = d2.next;
            }
        }
        d1 = headA;
        d2 = headB;
        if(c1>c2){
            for(int i=0;i<c1-c2;i++){
                d1 = d1.next;
            }
        }
        else if(c1<c2){
            for(int i=0;i<c2-c1;i++){
                d2 = d2.next;
            }
        }
        while(d1!=null && d2!=null){
            if(d1==d2) return d1;
            d1 = d1.next;
            d2 = d2.next;
        }
        return null;
    }
    // Optimal TC-O(2M) SC-O(1)
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null) return null;

        ListNode a = headA;
        ListNode b = headB;
        while(a!=b){
            a = a==null?headB : a.next;
            b = b==null?headA : b.next;
        }
        return a;
    }
}
