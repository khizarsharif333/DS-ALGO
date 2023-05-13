// Majority element
package Striver_SDE_Sheet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Code15 {
    // Optimal Leecode
    public static int majorityElement(int[] nums) {
        int count = 0;
        int element = 0;
        for(int val:nums) {
            if(count==0) element=val;
            if(element==val) count++;
            else count--;
        }
        return element;
    }
    // Incomplete codeStudio
    public static int findMajority(int[] arr, int n) {
        int maxCount = n/2;
        int element = -1;
        for(int val:arr) {
            int count =0;
            for(int value:arr){
                if(val==value){
                    count++;
                }
            }
            if(maxCount<count){
                element=val;
            }
        }
        return element;
    }
    public static void main(String[] args) {
        int[] array = {5,2,0,0};
        // System.out.println(majorityElement(array));
        System.out.println(findMajority(array,4));
    }
}
