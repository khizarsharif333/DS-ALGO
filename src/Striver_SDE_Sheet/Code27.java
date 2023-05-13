package Striver_SDE_Sheet;

import java.awt.*;

public class Code27 {
    public static ListNode head;
    class ListNode{
        int data;
        ListNode next;
        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    // Naive Approach TC-O(N+M) SC-O(M+N)
    public ListNode mergeTwoLists1(ListNode list1, ListNode list2) {
        if(list1==null) return list2;
        if(list2==null) return list1;
        if(list1.data< list2.data) {
            list1.next = mergeTwoLists1(list1.next,list2);
            return list1;
        }
        else{
            list2.next = mergeTwoLists1(list1,list2.next);
            return list2;
        }
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list2==null) return list1;
        if(list1==null) return list2;
        if(list1.data>list2.data){
            ListNode temp = list1;
            list1 = list2;
            list2 = temp;
        }
        ListNode res = list1;
        while(list1!=null && list2!=null){
            ListNode tmp = null;
            while(list1!=null && list1.data<=list2.data){
                tmp = list1;
                list1 = list1.next;
            }
            tmp.next = list2;
            // swap
            ListNode temp = list1;
            list1 = list2;
            list2 = temp;
        }
        return res;
    }
}
