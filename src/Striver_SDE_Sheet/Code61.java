package Striver_SDE_Sheet;

public class Code61 {
    public static double findNthRootOfM1(int n, int m) {
        return Math.pow(m,1.0/n);
    }
    public static double multiply(int n,double mid){
        double ans = 1.0;
        for(int i=1;i<n+1;i++){
            ans = ans * mid;
        }
        return ans;
    }
    public static double findNthRootOfM(int n, int m) {
        double low = 1;
        double high = m;
        double eps = 1e-7;
        while((high-low)>eps){
            double mid = (low + high)/2.0;
            if(multiply(n,mid)<m) low=mid;
            else high = mid;
        }
        return low;
    }
    public static void main(String[] args) {
        System.out.println(findNthRootOfM1(4,69));
        System.out.println(findNthRootOfM(4,69));
    }
}