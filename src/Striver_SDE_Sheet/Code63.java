package Striver_SDE_Sheet;

import java.util.ArrayList;

public class Code63 {
    // Naive
    public static int singleNonDuplicate1(int[] nums) {
        int vall = 0;
        for(int val:nums) vall^=val;
        return vall;
    }
    //Optimal
    public static int singleNonDuplicate(int[] nums) {
        int low = 0,high = nums.length-2;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==nums[mid^1]) low = mid+1;
            else high = mid-1;
        }
        return nums[low];
    }
    public static void main(String[] args) {
        int[] array = {3,3,7,7,10,11,11};
        System.out.println(singleNonDuplicate(array));
    }
}
