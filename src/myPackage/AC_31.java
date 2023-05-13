// Queue implementation using array
package myPackage;

public class AC_31{
    public static class Queue{
        static int rear = -1;
        static int[] arr;
        public int size;
        Queue(int n){
            arr = new int[n];
            this.size=n;
        }
        // check for empty
        public boolean isEmpty(){
            return rear==-1;
        }
        // Enqueue
        public void enqueue(int p){
            if(rear==size-1){
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear]=p;
        }
        // Dequeue
        public int dequeue(){
            if(isEmpty()){
                System.out.println("No element to remove");
                return -1;
            }
            int front = arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }
        // Peek
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
        Queue qu = new Queue(3);
        qu.enqueue(1);
        qu.enqueue(2);
        qu.enqueue(3);
        while(!qu.isEmpty()){
            System.out.println(qu.peek());
            qu.dequeue();
        }
    }
}
