package Striver_SDE_Sheet;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Code22 {
    // Bruteforce with TC-O(N2) SC-O(1)
    public static int LongestSubsetWithZeroSum1(ArrayList<Integer> arr) {
        int maxLen = 0;
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            int currSum = 0;
            for (int j = i; j < n; j++) {
                currSum += arr.get(j);
                if (currSum == 0)
                    maxLen = Math.max(maxLen, j - i + 1);
            }
        }
        return maxLen;
    }
    // Optimal with TC-O(N) SC-O(N)
    public static int longestSubArray(ArrayList<Integer> arr){
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        int maxLength = 0;
        int sum = 0;
        for(int i=0;i<arr.size();i++){
            sum+=arr.get(i);
            if(sum==0) maxLength=i+1;
            else{
                if(hashmap.get(sum)!=null){
                    maxLength = Math.max(maxLength,i-hashmap.get(sum));
                }
                else{
                    hashmap.put(sum,i);
                }
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(-1);
        array.add(2);
        array.add(-2);
        //int[] k = {1 ,3 ,-1 ,4 ,-4};
        System.out.println(longestSubArray(array));
        //System.out.println(subArrays(k));
    }
}
