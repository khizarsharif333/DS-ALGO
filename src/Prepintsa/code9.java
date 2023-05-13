// Decimal to hexadecimal 5554623035
package Prepintsa;

import java.util.ArrayList;
import java.util.List;

public class code9 {
    static void decimalToHexadecimal(int num){
        List<Character> binary = new ArrayList<>();
        // int[] binary = new int[20];
        int i=0;
        while(num>0){
            String ktr = "0123456789ABCDEF";
            int r= num%16;
            binary.add(ktr.charAt(r));
            num=num/16;
        }
        String str = "";
        for(int j=binary.size()-1;j>=0;j--){
            str+=binary.get(j);
        }
        System.out.println(str);
    }
    public static void main(String[] args) {
        decimalToHexadecimal(95476671);
    }
}