// Linked list problems
package myPackage;

import java.util.Scanner;

public class AC_27_6 {
    Node head;
    private int size;
    AC_27_6(){
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
            size++;
            return;
        }
        Node currentNode = head;
        while(currentNode.next!=null){
            currentNode=currentNode.next;
        }
        currentNode.next=newNode;
        size++;
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
    // search element
    public int indexOf(int num){
        Node node1 = head;
        int i=0;
        while(node1.data!=num){
            i++;
            node1=node1.next;
        }
        return i;
    }
    public void LastOfIndex(int num){
        Node node1 = head;
        if(head==null){
            System.out.println("No such element");
            return;
        }
        int i=0;
        int index = 0;
        while(node1!=null){
            if(node1.data==num){
                index=i;
            }
            i++;
            node1=node1.next;
        }
        System.out.println(index);
    }
    public static void main(String[] args) {
        AC_27_6 list = new AC_27_6();
        int[] array = {1,5,7,3,8,2,3};
        for(int i=0;i<7;i++){
            list.addLast(array[i]);
        }
        list.printList();
        System.out.println(list.indexOf(7));
        System.out.println(list.indexOf(3));
        list.LastOfIndex(3);
    }
}
