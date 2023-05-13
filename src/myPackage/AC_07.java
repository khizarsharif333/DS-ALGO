package myPackage;

//Functions and Methods

import java.util.*;

public class AC_07 {
    static int calculateSum(int a,int b){
        return a+b;
    }
    static int calculateProduct(int a,int b){
        return a*b;
    }
    static int factorial(int n){
        int fact=1;
        if (n == 0 || n == 1) {
            return fact;
        }
        else{
            for(int i=n;i>=1;i--){
                fact*=i;
            }
        }
        return fact;
    }
    static String primeOrNot(int n){
        boolean a = true;
        for(int i=2;i<n;i++){
            if (n % i == 0) {
                a = false;
                break;
            }
        }
        if(a){
            return "Prime Number!";
        }
        else{
            return "Not Prime!";
        }
    }
    static String evenOrNot(int n){
        if(n%2==0){
            return "Even";
        }
        else{
            return "Odd";
        }
    }
    static void printTable(int n){
        for(int i=1;i<=10;i++){
            System.out.printf("%d X %d = %d",n,i,(n*i));
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // int b= sc.nextInt();
        // System.out.printf("The sum of %d and %d is %d",a,b,calculateSum(a,b));
        // System.out.printf("The product of %d and %d is %d",a,b,calculateProduct(a,b));
        // System.out.printf("The factorial of %d is %d",a,factorial(a));
        // We call the Functions directly while we call the methods by object creation.
        // System.out.printf("The number %d is %s",a,primeOrNot(a));
        // System.out.printf("The number %d is %s",a,evenOrNot(a));
        printTable(a);
    }
}
