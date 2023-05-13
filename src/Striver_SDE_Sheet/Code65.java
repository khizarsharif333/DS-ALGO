package Striver_SDE_Sheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Code65 {
    // Naive
    public static double findMedianSortedArrays1(int[] nums1, int[] nums2) {
        int count1 = ((nums1.length+nums2.length)/2)-1;
        int count2 = (nums1.length+nums2.length)/2;
        int i=0,j=0,cnt = 0,result1 = 0,result2 = 0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                if(cnt==count1) result1 = nums1[i];
                if(cnt==count2) result2 = nums1[i];
                i++;
            }
            else{
                if(cnt==count1) result1 = nums2[j];
                if(cnt==count2) result2 = nums2[j];
                j++;
            }
            cnt++;
        }
        while(i<nums1.length){
            if(cnt==count1) result1 = nums1[i];
            if(cnt==count2) result2 = nums1[i];
            i++;
            cnt++;
        }
        while(j<nums2.length){
            if(cnt==count1) result1 = nums2[j];
            if(cnt==count2) result2 = nums2[j];
            j++;
            cnt++;
        }
        if((nums1.length+nums2.length)%2==0) return (result1+result2)/2.0;
        else return result2;
    }
    // Optimal
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums2.length<nums1.length) return findMedianSortedArrays1(nums2,nums1);
        int n1 = nums1.length;
        int n2 = nums2.length;
        int low = 0;
        int high = n1;
        while(low<=high){
            int cnt1 = (low+high)/2;
            int cnt2 = ((n1+n2+1)/2)-cnt1;

            int l1 = cnt1==0? Integer.MIN_VALUE : nums1[cnt1-1];
            int l2 = cnt2==0? Integer.MIN_VALUE : nums2[cnt2-1];

            int r1 = cnt1==n1? Integer.MAX_VALUE : nums1[cnt1];
            int r2 = cnt2==n2? Integer.MAX_VALUE : nums2[cnt2];

            if(l1<=r2 && l2<=r1){
                if((n1+n2)%2==0) return((Math.max(l1,l2)+Math.min(r1,r2))/2.0);
                else return Math.max(l1,l2);
            }
            else if(l1>r2) high = cnt1-1;
            else low = cnt1+1;
        }
        return 0.0;
    }
    public static void main(String[] args) {
        int[] a = {1,2};
        int[] b= {3,4};
        System.out.println(findMedianSortedArrays(a,b));
    }
}
