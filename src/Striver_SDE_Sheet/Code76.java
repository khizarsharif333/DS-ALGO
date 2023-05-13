package Striver_SDE_Sheet;

import java.util.Arrays;

public class Code76 {
    // Rabin Karp
    /*public static boolean findPattern1(String p, String s) {
        if(s.length()<p.length()) return false;
        if(p.equals(s)) return true;
        long targetCode = 0L;int m = p.length();
        for(int i=0;i<m;i++) targetCode += (p.charAt(i)*Math.pow(10,m-1-i));
        long sourceCode = 0L;
        int i =0;
        while(i<=s.length()-m) {
            if (i == 0) {
                for (int j = 0; j < m; j++) {
                    sourceCode += s.charAt(j) * Math.pow(10, m - 1 - j);
                }
            } else {
                sourceCode -= s.charAt(i - 1) * Math.pow(10, m - 1);
                sourceCode *= 10;
                sourceCode += s.charAt(i + m - 1);
            }
            if (sourceCode == targetCode) {
                if (s.substring(i, i + m).equals(p)) return true;
            }
            i++;
        }
        return false;
    }*/
    // KMP Algorithm
    public static int[] lps(String pattern){
        int n = pattern.length();
        int j = 0,i = 1;
        int[] array = new int[n];
        while(i<n){
            if(pattern.charAt(j)==pattern.charAt(i)) array[i++] = ++j;
            else{
                if(j==0) array[i++] = 0;
                else j = array[j-1];
            }
        }
        return array;
    }
    public static boolean findPattern(String p, String s) {
        int[] array = lps(p);
        System.out.println(Arrays.toString(array));
        int i = 0,j = 0;
        while(i<s.length()){
            if(p.charAt(j)==s.charAt(i)){
                i++;
                j++;
                if(i==s.length()) return true ;
                if(j==p.length()) return true ;
            }
            else{
                if(j==0) i++;
                else j = array[j-1];
            }
        }
        return false;
    }
    public static boolean findPattern1(String p, String s) {
        if(s.length()<p.length()) return false;
        if(p.equals(s)) return true;
        for(int i=0;i<=s.length()-p.length();i++){
            if(s.charAt(i)==p.charAt(0)){
                int j = p.length()-1;
                while(j>=0 && s.charAt(i+j)==p.charAt(j)) j--;
                if(j==-1) return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(findPattern("abcdabc","abcdabcd"));
    }
}
