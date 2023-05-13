package Striver_SDE_Sheet;

import java.util.Arrays;

public class Code73 {
    static String subs(String str,String[] strs){
        for (String s : strs) {
            if(str.length()==0) return "";
            String st = s.substring(0,str.length());
            if (str.equals(st)) continue;
            for(int j=0;j<str.length();j++){
                if(!(str.charAt(j)==st.charAt(j))){
                    str = str.substring(0,j);
                    break;
                }
            }
        }
        return str;
    }
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        String res = strs[0];
        for(int i=1;i<strs.length;i++){
            if(res.length()>strs[i].length()) res = strs[i];
        }
        return subs(res,strs);
    }
    // Simple solution
    public static String longestCommonPrefix1(String[] strs) {
        Arrays.sort(strs);
        String str1 = strs[0];
        String str2 = strs[strs.length-1];
        int ind = 0;
        while(ind<str1.length() && ind<str2.length()){
            if(str1.charAt(ind)==str2.charAt(ind)) ind++;
            else break;
        }
        return str1.substring(0,ind);
    }
    public static void main(String[] args) {
        String[] array = {"cir","car"};
        System.out.println(longestCommonPrefix1(array));
    }
}