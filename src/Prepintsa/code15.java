// Addition of two fractions
package Prepintsa;

public class code15 {
    static void fraction(int n1,int d1,int n2,int d2){
        int n,d;
        if(d1==d2){
            n=n1+n2;
            d=d1;
        }
        else{
            n=(n1*d2)+(n2*d1);
            d=d1*d2;
        }
        for(int i=d;i>=2;i--){
            if(n%i==0 && d%i==0){
                n=n/i;
                d=d/i;
            }
        }
        System.out.printf("%d/%d",n,d);
    }
    public static void main(String[] args) {
        fraction(14,15,1,15);
    }
}
