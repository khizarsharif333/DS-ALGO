package Striver_SDE_Sheet;

import java.util.ArrayList;

public class practice {
    public static void subArrays(int[] array, ArrayList<Integer> list, int[] str, int ind){
        if(ind==str.length){
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for(int val:list){
                if(val>max) max = val;
                if(val<min) min = val;
            }
            array[0] = array[0] + max*max * min;
            return;
        }
        int num = str[ind];
        list.add(num);
        subArrays(array,list,str,ind+1);
        list.remove(list.size()-1);
        subArrays(array,list,str,ind+1);
    }
    public static int sumOfPower(int[] nums) {
        int[] array = new int[1];
        subArrays(array,new ArrayList<>(),nums,0);
        return array[0];
    }
    public static void main(String[] args) {
        int[]  nums = {2,1,4};
        System.out.println("khizar");
        System.out.println(sumOfPower(nums));
    }
}
