package Striver_SDE_Sheet;

import java.util.ArrayList;
import java.util.Arrays;

public class Code03 {
    public static void swap(int[] array,int i,int j){
        int temp = array[i];
        array[i]=array[j];
        array[j]=temp;
    }
    public static void nextPermutation(int[] array){
        if(array==null || array.length<=1) return;
        int i = array.length-2;
        while(i>=0 && array[i]>=array[i+1]) i--;
        if(i>=0){
            int j= array.length-1;
            while(array[j]<=array[i]) j--;
            swap(array,i,j);
        }
        reverse(array,i+1, array.length-1);
    }
    public static void reverse(int[] array,int i,int j){
        while(i<j) swap(array,i++,j--);
    }
    public static void main(String[] args) {
        int[] array = {1,2,3};
        nextPermutation(array);
        System.out.println(Arrays.toString(array));
    }
}
