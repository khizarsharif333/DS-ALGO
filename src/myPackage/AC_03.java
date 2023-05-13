package myPackage;

import java.util.*;

public class AC_03 {
    static Boolean Eligible_to_vote(int n){
        return n >= 18;
    }
    static void Odd_or_even(int n){
        if(n%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
    static void Greater_or_lesser(long a,long b){
        if(a>b)
            System.out.println("A is Greater");
        else if(b>a)
            System.out.println("B is Greater");
            // We can remove braces if we need only one statement to get
            // executed after the if or else statement
        else
            System.out.println("Both are equal");
    }
    static void greet(int a){
        switch (a) {
            case 1 -> System.out.println("Hello");
            case 2 -> System.out.println("Namaste");
            case 3 -> System.out.println("Bonjour");
            default -> System.out.println("Invalid input");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        // long b = sc.nextInt();
        // System.out.println(Eligible_to_vote(n));
        // Odd_or_even(n);
        // Greater_or_lesser(a,b);
        greet(a);
    }
}
