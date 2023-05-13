// Hexadecimal to decimal
package Prepintsa;

public class code6 {
    static long hexadecimalToDecimal(String str){
        String hexRule = "0123456789ABCDEF";
        long count = 0;
        for(int i=0;i<str.length();i++){
            char currChar = str.charAt(i);
            count+=hexRule.indexOf(currChar)*Math.pow(16,str.length()-1-i);
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(hexadecimalToDecimal("FFFFFFAFDFE23312"));
    }
}
