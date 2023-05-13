package Striver_SDE_Sheet;

import java.util.*;

public class Code39 {
    // Optimal TC-O(N2) SC-O(1)
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list1 = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i==0 || (nums[i]!=nums[i-1])) {
                int front = i + 1,back = nums.length - 1;
                while (front < back) {
                    int sum = nums[i] + nums[front] + nums[back];
                    if (sum > 0) back--;
                    else if (sum < 0) front++;
                    else {
                        list1.add(Arrays.asList(nums[i],nums[front],nums[back]));
                        while (front < back && nums[front] == nums[front+1]) ++front;
                        while (front < back && nums[back] == nums[back-1]) --back;
                        front++;back--;
                    }
                }
            }
        }
        return list1;
    }
    // TC-O(N3) SC-O(N+N)
    public static List<List<Integer>> threeSum1(int[] nums) {
        Set<List<Integer>> list1 = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        Collections.sort(list);
                        list1.add(list);
                    }
                }
            }
        }
        return new ArrayList<>(list1);
    }

    public static void main(String[] args) {
        int[] array = {-1,0,1,2,-1,-4};
        System.out.println(threeSum1(array));
    }
}
