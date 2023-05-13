package Striver_SDE_Sheet;

import java.util.*;

public class Code52 {
    public static void sum(int ind, int[] candidates, int target, List<Integer> list, List<List<Integer>> ansList){
        if(target==0){
            ansList.add(new ArrayList<>(list));
            return;
        }
        for(int i=ind;i<candidates.length;i++){
            if(i>ind && candidates[i]==candidates[i-1]) continue;
            if(candidates[i]>target) break;
            list.add(candidates[i]);
            sum(i + 1, candidates, target - candidates[i], list, ansList);
            list.remove(list.size() - 1);
        }
    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ansList = new ArrayList<>();
        Arrays.sort(candidates);
        sum(0,candidates,target,new ArrayList<>(),ansList);
        return ansList;
    }

    public static void main(String[] args) {
        int[] candidates = {3,4,5,6};
        int target = 18;
        System.out.println(combinationSum2(candidates,target));
    }
}
