package Striver_SDE_Sheet;

public class Code04 {
    public static int largestSum(int[] nums){
        int sum=0;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            sum += num;
            if (max < sum) max = sum;
            if (sum < 0) sum = 0;
        }
        return max;
    }
    public static int largest(int[] nums){
        int max =0;
        for(int i=0;i< nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum>max) max=sum;
                if(sum<0) break;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] array = {5,4,-1,7,8};
        System.out.println(largestSum(array));
        System.out.println(largest(array));
    }
}
