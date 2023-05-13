package Prepintsa;

import java.util.ArrayList;
import java.util.List;

public class code35 {
    static void permutations(String str,String str1){
        if(str.length()==0){
            System.out.println(str1);
            return;
        }
        for(int i=0;i<str.length();i++){
            char current = str.charAt(i);
            String newStr = str.substring(0,i)+str.substring(i+1);
            permutations(newStr,str1+current);
        }
    }
    public static void main(String[] args) {
        permutations("ABC","");
    }
}
