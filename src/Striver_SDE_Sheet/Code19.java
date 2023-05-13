package Striver_SDE_Sheet;

import java.util.HashMap;
import java.util.Map;

public class Code19 {
    // TC-O(N2) SC-O(1)
    public int[] twoSum1(int[] nums, int target) {
        int[] array = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    array[0]=i;
                    array[1]=j;
                    break;
                }
            }
        }
        return array;
    }
    // Optimal
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                result[1] = i;
                result[0] = map.get(target-nums[i]);
                return result;
            }
            map.put(nums[i],i);
        }
        return result;
    }
    public static void main(String[] args) {

    }
}
