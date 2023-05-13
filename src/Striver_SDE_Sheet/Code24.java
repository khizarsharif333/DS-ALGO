package Striver_SDE_Sheet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Code24 {
    // Worst TC-o(n2) and SC-O(N)
    public static int lengthOfLongestSubstring1(String s) {
        Set<Character> char1 = new HashSet<>();
        int maxCount = 0;
        for(int i=0;i<s.length();i++){
            int count =0;
            for(int j=i;j<s.length();j++){
                if(char1.contains(s.charAt(j))) break;
                else{
                    char1.add(s.charAt(j));
                    count++;
                }
                maxCount = Math.max(maxCount,count);
            }
            char1.clear();
        }
        return maxCount;
    }
    // TC-O(2N) SC-O(N)
    public static int lengthOfLongestSubstring2(String s) {
        int l = 0;
        int r = 0;
        Set<Character> char1 = new HashSet<>();
        int maxCount = 0;
        while(r<s.length()){
            if(char1.contains(s.charAt(r))){
                while(char1.contains(s.charAt(r))){
                    char1.remove(s.charAt(l));
                    l++;
                }
            }
            char1.add(s.charAt(r));
            maxCount = Math.max(maxCount,r-l+1);
            r++;
            // System.out.println(maxCount);
        }
        return maxCount;
    }
    public static int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        int maxCount = 0;
        while(right<n){
            if(map.containsKey(s.charAt(right))) left = Math.max(map.get(s.charAt(right))+1,left);
            map.put(s.charAt(right),right);
            maxCount = Math.max(maxCount,right-left+1);
            right++;
            // System.out.println(maxCount);
        }
        return maxCount;
    }
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
