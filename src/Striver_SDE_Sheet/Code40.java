package Striver_SDE_Sheet;

import java.util.Arrays;

public class Code40 {
    // Better
    public static int trap1(int[] height) {
        int n = height.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int max = 0;
        for(int i=0;i<n;i++){
            int count = height[i];
            max = Math.max(max,count);
            prefix[i] = max;
        }
        max = 0;
        for(int i=n-1;i>=0;i--){
            int count = height[i];
            max = Math.max(max,count);
            suffix[i] = max;
        }
        max = 0;
        for(int i=0;i<n;i++){
            max += Math.min(prefix[i],suffix[i]) - height[i];
        }
        return max;
    }
    public static int trap(int[] height) {
        int n = height.length;
        int left = 0,right = n-1,leftMax = 0,rightMax = 0,res = 0;
        while(left<=right){
            if(height[left]<=height[right]){
                if(height[left]>=leftMax) leftMax = height[left];
                else res+= leftMax - height[left];
                left++;
            }
            else{
                if(height[right]>=rightMax) rightMax = height[right];
                else res+= rightMax - height[right];
                right--;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] array = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(array));
    }
}
