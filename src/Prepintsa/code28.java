// Prime Number using Recursion in Java
package Prepintsa;

public class code28 {
    static boolean primeOrNot(int n,int i){
        if(n<=2)
            return n == 2;
        else if(n%i==0)
            return false;
        else if(i*i>n)
            return true;
        return primeOrNot(n,i+1);
    }

    public static void main(String[] args) {
        if(primeOrNot(-20,2))
            System.out.println("Prime");
        else System.out.println("Not prime");
    }
}
