package Striver_SDE_Sheet;

public class Code14 {
    // Code studio
    public static int modularExponentiation(int x, int n, int m) {
        double ans = 1.0;
        long nn = n;
        double p = x;
        if(n<0) nn = -1 * n;
        while(nn>0){
            if(nn%2==1){
                ans = (ans*p)%m;
                nn = nn-1;
            }
            else{
                p = (p*p)%m;
                nn = nn/2;
            }
        }
        if(n<0) return (int)((double) (1.0)/ (double) (ans));
        return (int) (ans%m);
    }
    // Leetcode
    public static double myPow(double x, int n) {
        double ans = 1.0;
        long nn = n;
        if(n<0) nn = nn*-1;
        while(nn>0){
            if(nn%2==1){
                ans*=x;
                nn = nn-1;
            }
            else{
                x = x*x;
                nn = nn/2;
            }
        }
        if(n<0) return ((double) (1.0)/ (double) (ans));
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(myPow(10000000 ,10));
        System.out.println();
    }
}
