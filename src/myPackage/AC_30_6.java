package myPackage;
// import java.util.Collections;
import java.util.Stack;

public class AC_30_6 {
    public static void pushAtBottom(int data,Stack<Integer> stack){
        if(stack.isEmpty()){
            stack.push(data);
            return;
        }
        int top = stack.pop();
        pushAtBottom(data,stack);
        stack.push(top);
    }
    public static void stackReverse(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int value = stack.pop();
        stackReverse(stack);
        pushAtBottom(value,stack);
    }
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        // pushAtBottom(4,stack);
        // while(!stack.isEmpty()){
        //     System.out.println(stack.peek());
        //     stack.pop();
        // }
        // System.out.println("--------");
        stackReverse(stack);
        // System.out.println(stack.size());
        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
