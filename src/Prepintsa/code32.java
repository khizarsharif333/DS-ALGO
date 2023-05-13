// HCF of a Number using Recursion in Java
package Prepintsa;

public class code32 {
    static int hcf(int num1,int num2){
        if(num1==0) return num2;
        else if(num2==0) return num1;
        if(num1%num2==0) return num2;
        else if(num2%num1==0) return num1;
        else if(num1==num2) return num1;
        else if(num1>num2) return hcf(num1-num2,num2);
        else return hcf(num1,num2-num1);
    }
    static int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
    public static void main(String[] args) {
        System.out.println(hcf(360,231));
        System.out.println(gcd(360,231));
    }
}
