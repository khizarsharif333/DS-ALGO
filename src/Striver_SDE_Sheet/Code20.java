package Striver_SDE_Sheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Code20 {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums==null || nums.length==0) return result;
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int front = j+1;
                int back = n-1;
                long target2 = ((long)target - (long)(nums[i]+nums[j]));
                while(front<back){
                    long two_sum = (nums[front]+nums[back]);
                    if(target2>two_sum) front++;
                    else if(target2<two_sum) back--;
                    else{
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[front]);
                        list.add(nums[back]);
                        result.add(list);

                        while(front<back && nums[front]==list.get(2)) ++front;

                        while(front<back && nums[back]==list.get(3)) --back;
                    }
                }
                while(j+1<n && nums[j+1]==nums[j]) ++j;
            }
            while(i+1<n && nums[i+1]==nums[i]) ++i;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] array = {1,0,-1,0,-2,2};
        System.out.println(fourSum(array,0));
    }
}
