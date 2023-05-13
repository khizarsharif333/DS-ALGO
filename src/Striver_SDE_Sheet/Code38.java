package Striver_SDE_Sheet;

import java.util.HashMap;

public class Code38 {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    // TC-O(N)+O(N) SC-O(N)
    public Node copyRandomList1(Node head) {
        if(head==null) return null;
        Node cur = head;
        HashMap<Node,Node> hash = new HashMap<>();
        while(cur!=null){
            Node temp =new Node(cur.val);
            hash.put(cur,temp);
            cur = cur.next;
        }
        cur = head;
        while(cur!=null){
            hash.get(cur).next = hash.get(cur.next)==null?null :hash.get(cur.next);
            hash.get(cur).random = hash.get(cur.random)==null?null :hash.get(cur.random);
            cur = cur.next;
        }
        return hash.get(head);
    }
    // TC-O(N)+O(N)+O(N) SC-O(1)
    public Node copyRandomList(Node head) {
        if(head==null) return null;
        Node cur = head;
        while(cur!=null){
            Node temp =new Node(cur.val);
            temp.next = cur.next;
            cur.next = temp;
            cur = cur.next.next;
        }
        cur = head;
        while(cur!=null){
            if(cur.random!=null){
                cur.next.random = cur.random.next ;
            }
            cur = cur.next.next;
        }
        cur = head;
        Node pseudoHead = new Node(0);
        Node copy = pseudoHead;
        while(cur!=null){
            Node front = cur.next.next;
            copy.next = cur.next;
            cur.next = front;
            cur = cur.next;
            copy = copy.next;
        }
        return pseudoHead.next;
    }
}
