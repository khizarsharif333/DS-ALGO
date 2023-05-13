// Least common multiple
package Prepintsa;

public class code2 {
    static int getHCF (int a, int b) {
        return b == 0 ? a : getHCF (b, a % b);
    }
    static int lcm(int num1,int num2){
        return (num1* num2)/getHCF(num1,num2);
    }
    static void lCM(int num1,int num2){
        int max =Math.max(num1,num2);
        for(int i=max;i<=num1*num2;i+=max){
            if(i%num1==0 && i%num2==0){
                System.out.println("LCM is "+i);
                break;
            }
        }
    }
    public static void main(String[] args) {
        // System.out.println(lcm(12,14));
        lCM(12,11);
    }
}
