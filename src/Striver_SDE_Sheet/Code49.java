package Striver_SDE_Sheet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Code49 {
    // Worst TC and SC
    public static void subsets(int[] num, int ind, int sum, ArrayList<Integer> list){
        if(ind==num.length){
            list.add(sum);
            return;
        }
        subsets(num,ind+1,sum+num[ind],list);
        subsets(num,ind+1,sum,list);
    }
    public static ArrayList<Integer> subsetSum(int[] num) {
        ArrayList<Integer> list = new ArrayList<>();
        subsets(num,0,0,list);
        Collections.sort(list);
        return list;
    }
    public static void main(String[] args) {
        int[] num = {1,2,3};
        System.out.println(subsetSum(num));
    }
}
