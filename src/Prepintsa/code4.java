// Binary to decimal
package Prepintsa;

import java.util.*;
public class code4 {
    static int power(int base,int power){
        int count = 1;
        for(int i=1;i<=power;i++){
            count*=base;
        }
        return count;
    }
    static int binaryToDecimal(String str){
        int count = 0;
        for(int i=0;i<str.length();i++){
            //count+=Math.pow(2,str.length()-1-i);
            int c = Integer.parseInt(String.valueOf(str.charAt(i)));
            count+=c*power(2,str.length()-1-i);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String str1 = sc.next();
        System.out.println(binaryToDecimal("111111111"));
    }
}
