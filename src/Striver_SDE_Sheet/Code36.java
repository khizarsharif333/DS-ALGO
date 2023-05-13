package Striver_SDE_Sheet;

import java.util.HashMap;

public class Code36 {
    class Node {
        int data;
        Node next;
        Node child;

        public  Node(int data) {
            this.data = data;
            this.next = null;
            this.child = null;
        }
    }
    public  Node merge(Node a, Node b){
        Node temp = new Node(0);
        Node res = temp;
        while(a!=null && b!=null){
            if(a.data<b.data){
                temp.child = a;
                temp = temp.child;
                a = a.child;
            }
            else{
                temp.child = b;
                temp = temp.child;
                b = b.child;
            }
        }
        if(a!=null) temp.child=a;
        else temp.child = b;
        return res.child;
    }
    public static Node flattenLinkedList(Node start) {
        Code36 c = new Code36();
        if(start==null || start.next==null) return start;
        start.next = flattenLinkedList(start.next);
        start = c.merge(start,start.next);
        return start;
    }
}
