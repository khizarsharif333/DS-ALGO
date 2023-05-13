package Striver_SDE_Sheet;

import java.util.ArrayList;
import java.util.List;

public class Code16 {
    // Time complexity - O(n2)
    public static List<Integer> majorityElement1(int[] nums) {
        List<Integer> list1 = new ArrayList<>();
        int n = nums.length;
        for(int val:nums){
            if(list1.contains(val)) continue;
            int count =0;
            for(int value:nums){
                if(val==value) count++;
            }
            if(count>n/3) {
                list1.add(val);
            }
        }
        return list1;
    }
    // Optimal Solution with  TC-O(2n) SC-O(1)
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int num1 = Integer.MIN_VALUE;
        int num2 = Integer.MIN_VALUE;
        int count1 = 0;
        int count2 = 0;
        for(int val:nums){
            if(val==num1) count1++;
            else if(val==num2) count2++;
            else if(count1==0) {
                num1 = val;
                count1=1;
            }
            else if(count2==0) {
                num2 = val;
                count2=1;
            }
            else{
                count1--;
                count2--;
            }
        }
        int n = nums.length;
        count1 = 0;
        count2 = 0;
        for(int val:nums){
            if(num1==val) count1++;
            else if(num2==val) count2++;
        }
        if(count1>n/3) list.add(num1);
        if(count2>n/3) list.add(num2);
        return list;
    }
    // CodeStudio
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int num1 = Integer.MIN_VALUE;
        int num2 = Integer.MIN_VALUE;
        int count1 = 0;
        int count2 = 0;
        for(int val:arr){
            if(val==num1) count1++;
            else if(val==num2) count2++;
            else if(count1==0) {
                num1 = val;
                count1=1;
            }
            else if(count2==0) {
                num2 = val;
                count2=1;
            }
            else{
                count1--;
                count2--;
            }
        }
        int n = arr.size();
        count1 = 0;
        count2 = 0;
        for(int val:arr){
            if(num1==val) count1++;
            else if(num2==val) count2++;
        }
        if(count1>n/3) list.add(num1);
        if(count2>n/3) list.add(num2);
        return list;
    }
    public static void main(String[] args) {
        int[] array = {3,2,3};
        System.out.println(majorityElement(array));
    }
}
