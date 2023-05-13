package myPackage;

public class AC_17 {
    static void printNumbers(int n){
        if(n==6) {
            return;
        }
        System.out.println(n);
        printNumbers(n+1);
    }
    static int sumOfNatural(int n){
        if(n==0){
            return n;
        }
        return n+sumOfNatural(n-1);
    }
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    static void fibonacci(int a,int b,int n){
        if(n==0){
            return;
        }
        int c = a+b;
        System.out.print(a+" ");
        fibonacci(b,c,n-1);
    }
    static int power(int x,int n){
        // Memory Stack - n
        if(n==1){
            return x;
        }
        return x*power(x,n-1);
    }
    static int powerLog(int x,int n){
        // Memory Stack - n
        if(n==1){
            return x;
        }
        if(n%2==0){//If even
            return powerLog(x,n/2)*powerLog(x,n/2);
        }
        else{//If odd
            return powerLog(x,n/2)*powerLog(x,n/2)*x;
        }
    }
    public static void main(String[] args) {
        // int n=5;
        // printNumbers(n);
        // System.out.println(sumOfNatural(n));
        // System.out.println(factorial(6));
        // fibonacci(0,1,7);
        // System.out.println(power(5,3));
        System.out.println(powerLog(5,3));
    }
}
