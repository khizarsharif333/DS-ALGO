// Can a number be expressed as a sum of two prime numbers using Java?
package Prepintsa;

public class code17 {
    static int primeOrNot(int n){
        int c=1;
        for(int i=2;i<n;i++){
            if(n%i==0){
                c=0;
                break;
            }
        }
        return c;
    }
    static void sumOfTwoPrimeNumbers(int n){
        int x=0;
        for(int i=2;i<=n/2;i++){
            if(primeOrNot(i)==1){
                if(primeOrNot(n-i)==1){
                    System.out.printf("%d+%d",i,n-i);
                    System.out.println();
                    x=1;
                }
            }
        }
        if(x==0){
            System.out.println("No possible sum of prime numbers");
        }
    }
    public static void main(String[] args) {
        sumOfTwoPrimeNumbers(222);
    }
}
