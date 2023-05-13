// Octal to decimal
package Prepintsa;

public class code5 {
    static int octalToDecimal(String str){
        int count = 0;
        for(int i=0;i<str.length();i++){
            int c = Integer.parseInt(String.valueOf(str.charAt(i)));
            count+=c*Math.pow(8,str.length()-1-i);
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(octalToDecimal("512"));
    }
}
