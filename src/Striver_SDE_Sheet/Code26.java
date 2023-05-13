package Striver_SDE_Sheet;

import java.util.List;

public class Code26 {
    static ListNode head;
    private int size;
    Code26(){
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
    // Naive approach
    public ListNode middleNode1(ListNode head) {
        ListNode curNode = head;
        int count = 1;
        while(curNode.next!=null){
            curNode = curNode.next;
            count++;
        }
        curNode = head;
        for(int i=1;i<=(count/2);i++){
            curNode = curNode.next;
        }
        return curNode;
    }
    // Optimal Approach
    public ListNode middleNode(ListNode head){
        ListNode slow = head,fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {

    }
}
