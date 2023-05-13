// Given an integer N the task is to print the F(N)th term in Java
package Prepintsa;

public class code36 {
    static int j=1;
    static int count =0;
    static int fOfN(int n){
        if(n<1) return 0;
        for(int i=1;i<=n;i++){
            int p = 1;
            for(int k=1;k<=i;k++){
                p*=j++;
            }
            count+=p;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(fOfN(5));
    }
}
