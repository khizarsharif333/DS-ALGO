// Permutations in which n people can occupy r seats in a classroom in java
package Prepintsa;

public class code13 {
    static long factorial(int num){
        int fact = 1;
        for(int i=num;i>1;i--){
            fact*=i;
        }
        return fact;
    }
    static void permutations(int n,int r){
        long l = factorial(n)/factorial(n-r);
        System.out.println(l);
    }
    public static void main(String[] args) {
        permutations(5,9);
    }
}
