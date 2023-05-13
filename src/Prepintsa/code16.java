// Replace all 0’s with 1 in a given integer using Java
package Prepintsa;

public class code16 {
    static void replaceZero(int n){
        String str = Integer.toString(n);
        String str1 = "";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='0'){
                str1+='1';
            }
            else str1+=ch;
        }
        System.out.println(str1);
    }
    public static void main(String[] args) {
        replaceZero(987654320);
    }
}