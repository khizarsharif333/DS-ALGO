package Striver_SDE_Sheet;

import java.util.ArrayList;
import java.util.List;

public class Code55 {
    // Naive
    public static void backtrack1(int[] nums,List<Integer> list,List<List<Integer>> ans){
        if(list.size()==nums.length){
            ans.add(new ArrayList<>(list));
        }
        else{
            for(int val:nums){
                if(list.contains(val)) continue;
                list.add(val);
                backtrack1(nums,list,ans);
                list.remove(list.size()-1);
            }
        }
    }
    public static List<List<Integer>> permute1(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack1(nums,new ArrayList<>(),ans);
        return ans;
    }
    // Optimal
    public static void swap(int i,int j,int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void backtrack(int[] nums,int ind,List<List<Integer>> ans){
        if(ind==nums.length){
            List<Integer> list2 = new ArrayList<>();
            for(int val:nums) list2.add(val);
            ans.add(new ArrayList<>(list2));
            return;
        }
        for(int i=ind;i<nums.length;i++){
            swap(i,ind,nums);
            backtrack(nums,ind+1,ans);
            swap(i,ind,nums);
        }
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(nums,0,ans);
        return ans;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        System.out.println(permute(array));
    }
}
