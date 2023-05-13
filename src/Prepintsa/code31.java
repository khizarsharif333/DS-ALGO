// Reversing a Number using Recursion in Java
package Prepintsa;

public class code31 {
    static void reverseOfNumber(int num){
        if(num<10){
            System.out.println(num);
            return;
        }
        System.out.print(num%10);
        reverseOfNumber(num/10);
    }
    public static void main(String[] args) {
        reverseOfNumber(10123);
    }
}
