package Striver_SDE_Sheet;

public class Code42 {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for(int val:nums){
            count = val==1? count+1:0;
            max = Math.max(max,count);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(array));
    }
}
