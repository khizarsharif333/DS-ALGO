package Striver_SDE_Sheet;

import java.util.ArrayList;
import java.util.Arrays;

public class Code41 {
    // TC-O(2N) SC-O(N)
    public static int removeDuplicates2(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int val:nums){
            if(list.contains(val)) continue;
            else list.add(val);
        }
        for(int i=0;i<list.size();i++){
            nums[i]=list.get(i);
        }
        return list.size();
    }
    // TC-O(N) SC-O(1)
     public static int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        int i = 0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int[] array = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(array));
    }
}
