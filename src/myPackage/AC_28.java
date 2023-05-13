package myPackage;

public class AC_28 {
    Node head;
    private int size;
    AC_28(){
        this.size=0;
    }
    class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }
    // Add last
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currentNode = head;
        while(currentNode.next!=null){
            currentNode=currentNode.next;
        }
        currentNode.next=newNode;
    }
    // print
    public void printList(){
        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
        }
        System.out.println("null");
    }
    // Reverse
    public void reverseList(){
        if(head==null || head.next==null){
            return;
        }
        Node preNode = head;
        Node curNode = head.next;
        while(curNode!=null){
            Node nexNode = curNode.next;
            curNode.next=preNode;

            // update
            preNode=curNode;
            curNode=nexNode;
        }
        head.next=null;
        head=preNode;
    }
    // Reverse Recursive
    public Node reverseRecursive(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }
    public static void main(String[] args) {
        AC_28 list = new AC_28();
        list.addLast(5);
        list.addLast(4);
        list.addLast(3);
        list.addLast(2);
        list.addLast(1);
        list.printList();
        // list.reverseList();
        // list.head = list.reverseRecursive(list.head);
        list.printList();
    }
}
