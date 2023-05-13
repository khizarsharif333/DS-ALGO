// Decimal to binary
package Prepintsa;

import java.util.ArrayList;
import java.util.List;

public class code7 {
    static int decimalToBinary(int num){
        List<Integer> binary = new ArrayList<>();
        // int[] binary = new int[20];
        int i=0;
        while(num>0){
            int r= num%2;
            binary.add(r);
            num=num/2;
        }
        String str = "";
        for(int j=binary.size()-1;j>=0;j--){
            str+=binary.get(j);
        }
        return Integer.parseInt(str);
    }
    public static void main(String[] args) {
        System.out.println(decimalToBinary(65));
    }
}
