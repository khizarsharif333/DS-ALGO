// Generate all Combinations of Balanced Parentheses in Java

package Prepintsa;
import java.util.ArrayList;
import java.util.Scanner;
public class code40 {
    static void printBrackets(ArrayList<String> aL,int n,int o,int c,String str){
        if(o==n && c==n) {
            aL.add(str);
            return;
        }
        if(o<n) printBrackets(aL,n,o+1,c,str+'{');
        if(c<o) printBrackets(aL,n,o,c+1,str+'}');
    }
    public static void main(String[] args) {
        ArrayList<String> aL = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n= sc.nextInt();
        printBrackets(aL,n,0,0,"");
        for(String val:aL) System.out.println(val);
    }

}