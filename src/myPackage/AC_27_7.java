// Linked list problems
package myPackage;

import java.util.Scanner;

public class AC_27_7 {
    Node head;
    private int size;
    AC_27_7(){
        this.size=0;
    }
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    // Add last
    public void addLast(int num){
        Node newNode = new Node(num);
        if(head==null){
            head = newNode;
            return;
        }
        Node currentNode = head;
        while(currentNode.next!=null){
            currentNode=currentNode.next;
        }
        currentNode.next=newNode;
    }
    // print list
    public void printList(){
        if(head==null){
            System.out.println("list is empty!");
            return;
        }
        Node currentNode = head;
        while(currentNode!=null){
            System.out.print(currentNode.data+" -> ");
            currentNode=currentNode.next;
        }
        System.out.println("null");
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
    // check list for elements greater than 25
    public void greaterElement(){
        Node newNode = head.next;
        Node preNode = head;
        for(int i=0;i<50;i++){
            Node currNode = newNode;
            if(i==0){
                if(preNode.data>25){
                    deleteFirst();
                }
                continue;
            }
            if(preNode.data>25 && newNode.data>25){
                deleteFirst();
            }
            else if(newNode.data>25){
                deleteNode(preNode,newNode);
            }
            else{
                preNode=preNode.next;
            }
            newNode=currNode.next;
        }
    }
    // delete element
    public void deleteNode(Node preNode,Node newNode){
        size--;
        preNode.next=newNode.next;
    }
    public static void main(String[] args) {
        AC_27_7 list = new AC_27_7();
        int[] array = {1,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,
                2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,};
        for(int val:array){
            list.addLast(val);
        }
        list.printList();
        System.out.println(list.size);
        list.greaterElement();
        list.printList();
        System.out.println(list.size);
    }
}
