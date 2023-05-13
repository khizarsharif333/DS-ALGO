// Last non-zero digit in factorial in Java
package Prepintsa;

public class code38 {
    static int factorial(int num){
        if(num==0||num==1) return 1;
        return num*factorial(num-1);
    }
    public static void main(String[] args) {
        int fact =factorial(4);
        while(fact%10==0){
            fact/=10;
        }
        System.out.println(fact%10);
    }
}
