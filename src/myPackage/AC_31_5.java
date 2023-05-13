// Circular Queue implementation using array
package myPackage;

public class AC_31_5{
    public static class Queue{
        static int rear = -1;
        public static int[] arr;
        public int size;
        public int front = -1;
        Queue(int n){
            arr = new int[n];
            this.size=n;
        }
        // check for empty
        public boolean isEmpty(){
            return rear==-1 && front==-1;
        }
        // Is Full
        public boolean isFull(){
            return ((rear+1)%size) == front;
        }
        // Enqueue
        public void enqueue(int p){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=p;
        }
        // Dequeue
        public int dequeue(){
            if(isEmpty()){
                System.out.println("No element to remove");
                return -1;
            }
            int value = arr[front];
            // SINGLE element condition
            if(front==rear){
                front=rear=-1;
            }
            else{
                front=(front+1)%size;
            }
            return value;
        }
        // Peek
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        Queue qu = new Queue(5);
        qu.enqueue(1);
        qu.enqueue(2);
        qu.enqueue(3);
        qu.enqueue(4);
        qu.enqueue(5);
        qu.dequeue();
        qu.enqueue(6);
        qu.dequeue();
        qu.enqueue(7);
        for(int i=0;i<qu.size;i++){
            System.out.println(qu.arr[i]);
        }
    }
}
