package Striver_SDE_Sheet;

public class Code64 {
    public static int search1(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target) return i;
        }
        return -1;
    }
    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target) return mid;
            // Check if left half is sorted or not
            if(nums[low]<=nums[mid]){
                if(nums[low]<=target && nums[mid]>=target) high = mid-1;
                else low = mid+1;
            }
            // right is sorted if left is not
            else{
                if(nums[mid]<=target && nums[high]>=target) low = mid+1;
                else high = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {4,5,6,7,0,1,2};
        System.out.println(search(array,0));
    }
}
