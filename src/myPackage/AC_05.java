package myPackage;

import java.util.*;

public class AC_05 {
    static void pattern1(int n){
        // Solid Rectangle pattern
        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    static void pattern2(int n){
        // Hollow Rectangle
        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
                if((i==1 || j==0 || i==n-1 || j==n-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        // Half pyramid
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        // Inverted Half pyramid
        for(int i=n;i>=1;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        // Half pyramid with spaces
        for(int i=1;i<=n;i++){
            for(int j=n;j>i;j--) {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        // Half pyramid with numbers
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern7(int n){
        // Inverted Half pyramid
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern8(int n){
        // Half pyramid with numbers
        int k = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
    static void pattern9(int n){
        // Half pyramid with numbers
        int k =1;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                k=1;
            }
            for(int j=1;j<=i;j++){
                if(k==1){
                    System.out.print(k+" ");
                    k--;
                }
                else{
                    System.out.print(k+" ");
                    k++;
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer: ");
        int i = sc.nextInt();
        // pattern1(i);
        // pattern2(i);
        // pattern3(i);
        // pattern4(i);
        // pattern5(i);
        // pattern6(i);
        // pattern7(i);
        // pattern8(i);
        pattern9(i);
    }
}
