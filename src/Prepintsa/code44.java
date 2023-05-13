// Given a set of positive integers, find all its subsets in Java
package Prepintsa;
import java.util.Scanner;

public class code44 {
    static void printSubsets(String str,int ind,String str1){
        if(ind==str.length()){
            for(int i=0;i<str1.length();i++){
                System.out.print(str1.charAt(i)+" ");
            }
            System.out.println();
            return;
        }
        char ch = str.charAt(ind);
        printSubsets(str,ind+1,str1+ch);
        printSubsets(str,ind+1,str1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        String str = Integer.toString(n);
        printSubsets(str,0,"");
    }
}
