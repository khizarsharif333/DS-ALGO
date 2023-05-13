// Power of a Number using Recursion in Java
package Prepintsa;

public class code27 {
    static int powerOfNumber(int num,int power){
        if(power==0){
            return 1;
        }
        return num*powerOfNumber(num,power-1);
    }
    public static void main(String[] args) {
        System.out.println(powerOfNumber(5,4));
    }
}
