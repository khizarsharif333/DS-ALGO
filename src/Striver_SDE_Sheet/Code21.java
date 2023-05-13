package Striver_SDE_Sheet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Code21 {
    // TC-O(NLOGN)+O(N) SC-O(1)
    public static int longestConsecutive1(int[] nums) {
        Arrays.sort(nums);
        int maxCount = 0;
        int count = 1;
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 < nums.length && (nums[i] + 1 == nums[i + 1])) count++;
            else if (i + 1 < nums.length && nums[i] == nums[i + 1]) continue;
            else count = 1;
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
    // TC-O(3N) SC-O(N)
    public static int longestConsecutive(int[] nums){
        Set<Integer> set = new HashSet<Integer>();
        for(int val:nums) set.add(val);
        int maxCount = 0;
        for (int val:nums){
            if(!set.contains(val-1)){
                int curNum = val;
                int count = 1;
                while(set.contains(curNum+1)){
                    curNum += 1;
                    count += 1;
                }
                maxCount = Math.max(maxCount,count);
            }
        }
        return maxCount;
    }
    public static void main(String[] args) {
        int[] array = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(array));
    }
}
