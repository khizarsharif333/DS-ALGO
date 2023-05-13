// Find the Nth row in Pascal’s Triangle in Java
package Prepintsa;

import java.util.Arrays;

public class code39 {
    static int factorial(int n){
        if(n==0 || n==1) return 1;
        return n*factorial(n-1);
    }
    static void pascalTriangle(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(" "+factorial(i)/(factorial(i-j)*factorial(j)));
            }
            System.out.println();
        }
    }
    static void pascalTriangleNthRow(int n){
        int[] array = new int[n+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                if(i==n) {
                    array[j]=factorial(i) / (factorial(i - j) * factorial(j));
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args) {
        pascalTriangle(3);
        pascalTriangleNthRow(3);
    }
}
