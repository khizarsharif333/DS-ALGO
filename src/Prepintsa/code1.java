// Highest common factor
package Prepintsa;

import java.util.Scanner;

public class code1 {
    static void hcf(int num1,int num2){
        int num3 = Math.min(num1,num2);
        for(int i=num3;i>0;i--){
            if(num1%i==0 && num2%i==0){
                System.out.printf("Hcf of %d and %d is %d",num1,num2,i);
                break;
            }
        }
    }
    static int getHCF (int a, int b) {
        return b == 0 ? a : getHCF (b, a % b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        num1 = (num1 > 0) ? num1 : -num1;
        num2 = (num2 > 0) ? num2 : -num2;
        System.out.println(getHCF(num1,num2));
        hcf(num1,num2);
    }
}
