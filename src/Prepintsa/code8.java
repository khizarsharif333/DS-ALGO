// Decimal to octal 5554623035
package Prepintsa;

import java.util.ArrayList;
import java.util.List;

public class code8 {
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
        System.out.println(decimalToOctal(766715421));
    }
}
