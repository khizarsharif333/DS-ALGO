// Binary to octal
package Prepintsa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class code10 {
    static long binaryToDecimal(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            count+=Integer.parseInt(String.valueOf(str.charAt(i)))*Math.pow(2,str.length()-1-i);
        }
        return decimalToOctal(count);
    }
    static long decimalToOctal(int num){
        List<Integer> binary = new ArrayList<>();
        // int[] binary = new int[20];
        int i=0;
        while(num>0){
            int r= num%8;
            binary.add(r);
            num=num/8;
        }
        String str = "";
        for(int j=binary.size()-1;j>=0;j--){
            str+=binary.get(j);
        }
        return Long.parseLong(str);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number: ");
        String str = sc.next();
        System.out.println(binaryToDecimal(str));
    }
}
