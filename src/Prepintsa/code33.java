// LCM of Two Numbers using Recursion in Java
package Prepintsa;

public class code33 {
    static int getHCF(int a, int b) {
        return b == 0 ? a : getHCF(b, a % b);
    }
    static int getLCM(int a,int b){
        return (a*b)/getHCF(a,b);
    }
    public static void main(String[] args) {
        System.out.println(getLCM(165,300));
    }
}
