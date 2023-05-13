// QUEUE USING LINKED LIST
package myPackage;

public class AC_31_6 {
    public static Node head;
    int size;
    AC_31_6(){
        this.size=0;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static class Queue{
        Node tail;
        public boolean isEmpty(){
            return head==null & tail==null;
        }
        public void enqueue(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                tail=head=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }
        public int dequeue(){
            if(isEmpty()) {
                System.out.println("Can't delete");
                return -1;
            }
            int n = head.data;
            if(head==tail){
                tail=null;
            }
            head=head.next;
            return n;
        }
        public int peek(){
            if(isEmpty()) {
                System.out.println("Nothing to peek");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Queue qu = new Queue();
        qu.enqueue(1);
        qu.enqueue(2);
        qu.enqueue(3);
        qu.enqueue(4);
        while(!qu.isEmpty()){
            System.out.println(qu.peek());
            qu.dequeue();
        }
    }
}
