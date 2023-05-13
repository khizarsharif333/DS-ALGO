package myPackage;

import java.util.Scanner;

public class AC_01 {
    static void pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++) {
                if(j==i){
                    System.out.println("*");
                }
                else{
                    System.out.print("*");
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int i = sc.nextInt();
        pattern(i);
    }
}
