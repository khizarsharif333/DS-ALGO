package Striver_SDE_Sheet;

public class Code25 {
    static ListNode head;
    private int size;
    Code25(){
        this.size=0;
    }
    class ListNode{
        int data;
        ListNode next;
        ListNode(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }
    // Add first
    public void addFirst(int data){
        ListNode newNode = new ListNode(data);
        if(head ==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    // Add last
    public void addLast(int data){
        ListNode newNode = new ListNode(data);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode currentNode = head;
        while(currentNode.next!=null){
            currentNode=currentNode.next;
        }
        currentNode.next=newNode;
    }
    public void printList(ListNode head){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        ListNode currentNode = head;
        while(currentNode!=null){
            System.out.print(currentNode.data+" -> ");
            currentNode=currentNode.next;
        }
        System.out.println("NULL");
    }
    // TC -O(N)
    public ListNode reverseList1(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode pre = head;
        ListNode cur = head.next;
        while(cur!=null){
            ListNode nex = cur.next;
            cur.next=pre;
            pre = cur;
            cur = nex;
        }
        head.next = null;
        head = pre;
        return head;
    }
    // TC-O(N)
    public ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        while(head!=null){
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }
    public static void main(String[] args) {
        Code25 c25 = new Code25();
        c25.addFirst(1);
        c25.addFirst(2);
        c25.addFirst(3);
        c25.addFirst(4);
        c25.printList(head);
        c25.printList(c25.reverseList(head));
    }
}
