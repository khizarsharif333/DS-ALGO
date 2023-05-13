package myPackage;

import java.util.Scanner;

public class AC_EX_01 {
    static int avgOfThreeNumbers(int a,int b,int c){
        return (a+b+c)/3;
    }
    static int sumOfOddNumbers(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        return sum;
    }
    static int greaterOfTwo(int a,int b){
        return Math.max(a, b);
    }
    static double circumferenceOfCircle(int r){
        return 2*Math.PI*r;
    }
    static void eligibleToVote(int n){
        if(n>18){
            System.out.println("Eligible to vote!");
        }
        else{
            System.out.println("Not Eligible to vote!");
        }
    }
    static void infiniteLoopUsingDoWhile(){
        do{
            System.out.println("Hello!");
        }while(true);
    }
    static void countOfPositiveNegativeAndZero(int n) {
        Scanner sc = new Scanner(System.in);
        int pos= 0;
        int neg= 0;
        int zer= 0;
        while(n==1){
            System.out.print("Enter the number: ");
            int p = sc.nextInt();
            if(p>0){
                pos++;
            }
            else if(p<0){
                neg++;
            }
            else{
                zer++;
            }
            System.out.print("Press 1 to Continue or 0 to stop: ");
            n=sc.nextInt();
        }
        System.out.printf("The count of positive ,Negative and Zeros are %d,%d and %d Respectively!",pos,neg,zer);
    }
    static double toGetPower(int a,int b){
        return Math.pow(a,b);
    }
    static int gcd(int a,int b){
        int c = Math.min(a,b);
        int d =1;
        for(int i=c;i>0;i--){
            if(a%i==0 && b%i==0){
                d=i;
                break;
            }
        }
        return d;
    }
    static void gcd1(int a,int b){
        while(a!=b){
            if(a>b){
                a-=b;
            }
            else{
                b-=a;
            }
        }
        System.out.printf("The GCD is %d",a);
    }
    static void fibonacci(int n){
        int a = 0;
        int b = 1;
        System.out.print(a+" ");
        if(n>1) {
            for (int i = 1; i < n; i++) {
                System.out.print(b + " ");
                int c = a + b;
                a = b;
                b = c;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // System.out.print("Press 1 to Continue or 0 to stop: ");
        int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // System.out.printf("The Average of %d,%d and %d is %d",a,b,c,avgOfThreeNumbers(a,b,c));
        // System.out.printf("The sum f odd numbers from 1 to %d is %d",a,sumOfOddNumbers(a));
        // System.out.printf("the Greater among %d and %d is %d",a,b,greaterOfTwo(a,b));
        // System.out.println("Circumference is "+circumferenceOfCircle(a));
        // eligibleToVote(a);
        // infiniteLoopUsingDoWhile();
        // countOfPositiveNegativeAndZero(a);
        // System.out.printf("%d power %d is %f",a,b,toGetPower(a,b));
        // System.out.printf("The GCD of %d and %d is %d",a,b,gcd(a,b));
        // gcd1(a,b);
        fibonacci(a);
    }
}
