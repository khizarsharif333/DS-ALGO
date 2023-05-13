package Striver_SDE_Sheet;

public class Code75 {
    // Very simple
    public static int strStr1(String haystack, String needle) {
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        return -1;
    }
    public static int strStr(String haystack, String needle) {
        if(haystack.length()<needle.length()) return -1;
        int n = needle.length(),h = haystack.length();
        for(int i=0;i<=h-n;i++){
            int j = 0;
            while(j<n && haystack.charAt(i+j)==needle.charAt(j)) j++;
            if(j==n) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad","sad"));
    }
}
