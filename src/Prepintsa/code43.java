// Print N-bit binary numbers having more 1’s than 0’s in all prefixes in Java
package Prepintsa;
import java.util.Scanner;
public class code43 {
    static void printBinary(int n,String str,int ones,int zeros){
        if(n==0){
            System.out.print(str+" ");
            return;
        }
        printBinary(n-1,str+"1",ones+1,zeros);
        if(zeros<ones) printBinary(n-1,str+"0",ones,zeros+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        printBinary(n,"",0,0);
    }
}
