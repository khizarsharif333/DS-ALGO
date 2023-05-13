package Striver_SDE_Sheet;

import java.util.*;

public class Code51 {
    public static void sum(int ind, int[] candidates,int target, List<Integer> list, List<List<Integer>> ansList){
        if(ind== candidates.length) {
            if (target == 0) {
                ansList.add(new ArrayList<>(list));
            }
            return;
        }
        if(target>=candidates[ind]){
            list.add(candidates[ind]);
            sum(ind,candidates,target-candidates[ind],list,ansList);
            list.remove(list.size()-1);
        }
        sum(ind+1,candidates,target,list,ansList);
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> set = new ArrayList<>();
        sum(0,candidates,target,new ArrayList<>(),set);
        return set;
    }

    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        System.out.println(combinationSum(candidates,target));
    }
}
