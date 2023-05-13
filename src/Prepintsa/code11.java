// Octal to binary 001010011100101110111
package Prepintsa;

import java.util.ArrayList;
import java.util.List;

public class code11 {
    static long octalToBinary(String str){
        int count = 0;
        for(int i=0;i<str.length();i++){
            count+=Integer.parseInt(String.valueOf(str.charAt(i)))*Math.pow(8,str.length()-1-i);
        }
        return decimalToBinary(count);
    }
    static long decimalToBinary(int count){
        List<Integer> binary = new ArrayList<>();
        while(count>0){
            int r=count%2;
            binary.add(r);
            count = count/2;
        }
        String str = "";
        for(int i=binary.size()-1;i>=0;i--){
            str+=binary.get(i);
        }
        return Long.parseLong(str);
    }
    public static void main(String[] args) {
        System.out.println(octalToBinary("1234567"));
    }
}
