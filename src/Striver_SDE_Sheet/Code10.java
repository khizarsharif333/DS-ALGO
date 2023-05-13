package Striver_SDE_Sheet;

public class Code10 {
    // Time limit exceeded
    public static int findDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(temp==nums[j]) return temp;
            }
        }
        return 0;
    }
    // Executed with Time complexity - O(n) Space complexity -O(n)
    public static int find(int[] array){
        boolean[] array1 = new boolean[array.length];
        for (int j : array) {
            if (array1[j]) return j;
            array1[j] = true;
        }
        return 0;
    }
    // Turtle and hare
    public static int findDuplicates(int[] array){
        int slow = array[0];
        int fast = array[0];
        do{
            slow = array[slow];
            fast = array[array[fast]];
        }while(slow!=fast);
        fast = array[0];
        while(slow!=fast){
            slow = array[slow];
            fast = array[fast];
        }
        return slow;
    }
    public static void main(String[] args) {
        int[] array = {1,3,4,2,2};
        System.out.println(findDuplicate(array));
        System.out.println(find(array));
        System.out.println(findDuplicates(array));
    }
}
