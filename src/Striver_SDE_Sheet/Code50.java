package Striver_SDE_Sheet;

import java.util.*;

public class Code50 {
    // Naive
    public static void subsets(Set<ArrayList<Integer>> set,ArrayList<Integer> list,int[] nums, int ind){
        if(ind==nums.length){
            set.add(new ArrayList<>(list));
            return;
        }
        int cur = nums[ind];
        list.add(cur);
        subsets(set,list,nums,ind+1);
        list.remove(list.size()-1);
        subsets(set,list,nums,ind+1);
    }
    public static ArrayList<ArrayList<Integer>> subsetsWithDup1(int[] nums) {
        Arrays.sort(nums);
        Set<ArrayList<Integer>> set = new HashSet<>();
        subsets(set,new ArrayList<>(),nums,0);
        return new ArrayList<>(set);
    }
    // Optimal
    public static void findSubsets(int ind,int[] nums,List<Integer> list,List<List<Integer>> ansList){
        ansList.add(new ArrayList<>(list));
        for(int i=ind;i<nums.length;i++){
            if(i!=ind && nums[i]==nums[i-1]) continue;
            list.add(nums[i]);
            findSubsets(i+1,nums,list,ansList);
            list.remove(list.size()-1);
        }
    }
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ansList = new ArrayList<>();
        findSubsets(0,nums,new ArrayList<>(),ansList);
        return ansList;
    }
    public static void main(String[] args) {
        int[] nums = {4,4,4,1,4};
        System.out.println(subsetsWithDup(nums));
    }
}
