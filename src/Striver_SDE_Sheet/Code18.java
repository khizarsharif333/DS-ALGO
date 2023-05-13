package Striver_SDE_Sheet;

import java.util.ArrayList;

public class Code18 {
    // Time limit exceeded
    public static int reversePairs1(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]/(long)2>nums[j]) count++;
            }
        }
        return count;
    }
    // Optimal Approach
    static int merge(int[] array,int low,int mid,int high){
        int count = 0;
        int j = mid+1;
        for(int i=low;i<=mid;i++){
            while(j<=high && array[i]> (2*(long)array[j])) j++;
            count += (j-(mid+1));
        }
        ArrayList<Integer> list = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while(left<=mid && right<=high){
            if(array[left]<array[right]){
                list.add(array[left]);
                left++;
            }
            else{
                list.add(array[right++]);
            }
        }
        while(left<=mid) list.add(array[left++]);
        while(right<=high) list.add(array[right++]);
        for(int i=low;i<=high;i++){
            array[i]=list.get(i-low);
        }
        return count;
    }
    static int mergeSort(int[] array,int low,int high){
        if(low>=high) return 0;
        int mid = low + (high-low)/2;
        int inv = mergeSort(array,low,mid);
        inv += mergeSort(array,mid+1,high);
        inv += merge(array,low,mid,high);
        return inv;
    }
    public static int reversePairs(int[] nums){
        return mergeSort(nums,0,nums.length-1);
    }
    public static void main(String[] args) {
        int[] array = {2147483647,2147483647,2147483647,2147483647,2147483647,2147483647};
        System.out.println(reversePairs(array));
    }
}
