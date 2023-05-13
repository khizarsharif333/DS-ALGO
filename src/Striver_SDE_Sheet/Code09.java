package Striver_SDE_Sheet;

import java.util.Arrays;

public class Code09 {
    // If size of first array is m+n
    // 88. Merge Sorted Array (Leetcode)
    public static void mergeSingle(int[] nums1, int m, int[] nums2, int n) {
        int k=0;
        for(int i=m;i<m+n;k++,i++){
            nums1[i]=nums2[k];
        }
        System.out.println(Arrays.toString(nums1));
        for(int i=1;i<m+n;i++){
            int temp = nums1[i];
            int j=i-1;
            while(j>=0 && nums1[j]>nums1[j+1]){
                nums1[j+1]=nums1[j];
                j--;
                nums1[j+1]=temp;
            }
        }
    }
    // If there is n extra space
    public static void mergeDouble(int[] nums1, int m, int[] nums2, int n) {
        int l =0;
        for(int k=0;k<m;k++){
            if(nums1[k]>nums2[l]){
                int temp1 = nums1[k];
                nums1[k]=nums2[l];
                nums2[l]=temp1;
                for(int i=1;i<n;i++){
                    int temp = nums2[i];
                    int j=i-1;
                    while(j>=0 && nums2[j]>nums2[j+1]){
                        nums2[j+1]=nums2[j];
                        j--;
                    }
                    nums2[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] nums2 = {1,2,3};
        int[] nums1 = {4,5,6,0,0,0};
        mergeSingle(nums1,3,nums2,3);
        System.out.println(Arrays.toString(nums1));
        // System.out.println(Arrays.toString(nums2));
    }
}