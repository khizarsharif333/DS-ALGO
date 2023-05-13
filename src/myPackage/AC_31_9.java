package myPackage;

import java.util.Stack;

public class AC_31_9 {
    public static class Queue{
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        public boolean isEmpty(){
            return s1.isEmpty();
        }
        public void add(int data){
            s1.push(data);
        }
        public int remove(){
            if(s1.isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            int p = s2.pop();
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
            return p;
        }
        public int peek(){
            if(s1.isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            int p = s2.peek();
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
            return p;
        }
    }
    public static void main(String[] args) {
        Queue qu = new Queue();
        qu.add(1);
        qu.add(2);
        qu.add(3);
        while(!qu.isEmpty()){
            System.out.println(qu.peek());
            qu.remove();
        }
    }
}
