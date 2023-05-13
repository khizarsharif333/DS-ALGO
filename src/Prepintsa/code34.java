// To Calculate length of The String Using Recursion in Java
package Prepintsa;

public class code34 {
    static int lengthOfStr(String str){
        if(str.equals("")) return 0;
        return lengthOfStr(str.substring(1))+1;
    }
    static int lengthOfString(String str){
        int i=0;
        char[] array = str.toCharArray();
        for(char element:array){
            i++;
        }
        return i;
    }
    public static void main(String[] args) {
        System.out.println(lengthOfStr("appleOrange"));
        System.out.println(lengthOfString("appleOrange"));
    }
}
