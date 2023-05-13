// Linked List
package myPackage;

import Striver_SDE_Sheet.Code25;

class AC_27{
    static Node head;
    private int size;
    AC_27(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;
        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }
    // Add first
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head ==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    // Add last
    public void addLast(String data){
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
    // Add
    public void add(int index,String str){
        if(index>size || index<0){
            System.out.println("Invalid index");
            return;
        }
        Node newNode = new Node(str);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode = head;
        for(int i=0;i<index;i++){
            if(i==index-1){
                Node node1 = currNode.next;
                currNode.next=newNode;
                newNode.next=node1;
            }
            currNode=currNode.next;
        }
    }
    // print linked list
    public void printList(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node currentNode = head;
        while(currentNode!=null){
            System.out.print(currentNode.data+" -> ");
            currentNode=currentNode.next;
        }
        System.out.println("NULL");
    }
    // delete first
    public void deleteFirst(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        size--;
        head = head.next;
    }
    // delete last
    public void deleteLast(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }
    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
        AC_27 list = new AC_27();
        list.addFirst("Apple");
        list.addLast("is");
        list.addLast("tasty");
        list.printList();
        list.add(2,"fucking");
        list.printList();
        // list.addFirst("is");
        // System.out.println(list.getSize());
        // list.addFirst("Ravi");
        // System.out.println(list.getSize());
        // list.addLast("a");
        // System.out.println(list.getSize());
        // list.addLast("goodBoy");
        // System.out.println(list.getSize());
        // list.printList();
        // list.deleteFirst();
        // System.out.println(list.getSize());
        // list.deleteLast();
        // System.out.println(list.getSize());
        // list.printList();
    }
}