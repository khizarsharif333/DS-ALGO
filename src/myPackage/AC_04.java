package myPackage;

import java.util.*;

public class AC_04 {
    static int sum_NN(int n){
        int i = 1;
        int sum = 0;
        while(i<=n){
            sum+=i;
            i++;
        }
        return sum;
    }
    static void tables(int n){
        for(int i=1;i<=10;i++){
            System.out.printf("%d x %d = %d\n",n,i,n*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter the integer: \n");
        // System.out.println(sum_NN(n));
        tables(n);
    }
}
