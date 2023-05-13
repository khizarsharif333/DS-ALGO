package myPackage;

import java.util.Scanner;

public class AC_06 {
    static void pattern11(int n) {
//        Butterfly pattern
        for(int p=1;p<=n;p++){
            if(p<=n/2) {
                    for (int k = 1; k <= p; k++) {
                        System.out.print("*");
                    }
                    for (int j = 1; j <= n - (p * 2); j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= p; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
            }
            else {
                for (int k = p; k <=n; k++) {
                    System.out.print("*");
                }
                for (int j = 1; j <= (p*2)-(n+2); j++) {
                    System.out.print(" ");
                }
                for (int k = p; k <=n ; k++) {
                    System.out.print("*");
                }
               System.out.println();
            }
        }
    }
    static void pattern12(int n){
//        Solid rhombus
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=n;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern13(int n){
        // Number pyramid
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    static void pattern14(int n){
        // Palindrome pyramid pattern
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int k=i;k>0;k--){
                System.out.print(k);
            }
            if(i>1){
                for(int p=2;p<=i;p++){
                    System.out.print(p);
                }
            }
            System.out.println();
        }
    }
    static void pattern15(int n){
        // Diamond pattern
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int p =i;p>0;p--){
                System.out.print("*");
            }
            for(int p=2;p<=i;p++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>0;i--){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int p =i;p>0;p--){
                System.out.print("*");
            }
            for(int p=2;p<=i;p++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern16(int n) {
//        Hollow Butterfly pattern
        for(int p=1;p<=n;p++){
            if(p<=n/2) {
                for (int k = 1; k <= p; k++) {
                    if(k==1 || k==p) {
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                for (int j = 1; j <= n - (p * 2); j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= p; k++) {
                    if(k==1 || k==p) {
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            else {
                for (int k = p; k <=n; k++) {
                    if(k==p || k==n) {
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                for (int j = 1; j <= (p*2)-(n+2); j++) {
                    System.out.print(" ");
                }
                for (int k = p; k <=n ; k++) {
                    if(k==p || k==n) {
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
    static void pattern17(int n){
//        Hollow Rhombus
        for(int i=1;i<=n;i++){
            for(int k=i;k<n;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                if(j==1 || j==n || i==1 || i==n) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void pattern18(int n){
        for(int i=0;i<n;i++){
            for(int j=i;j<n-1;j++){
                System.out.print(" ");
            }
            double k = Math.pow(11,i);
            int f = (int)k;
            String str = Integer.toString(f);
            for(int j=0;j<str.length();j++){
                System.out.print(str.charAt(j)+" ");
            }
            System.out.println();
        }
    }
    static void pattern19(int n){
//        Half pyramid
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
    static void pattern20(int n){
//        Inverted Half pyramid
        for(int i=1;i<=n;i++){
            for(int k=n;k>=i;k--){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer: ");
        int i = sc.nextInt();
        // pattern11(i);
        // pattern12(i);
        // pattern13(i);
        // pattern14(i);
        // pattern15(i);
        // pattern16(i);
        // pattern17(i);
        pattern18(i);
        // pattern19(i);
        // pattern20(i);
    }
}
