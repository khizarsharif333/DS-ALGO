package Striver_SDE_Sheet;

import java.util.Arrays;

public class Code12 {
    static int mergeAndCount(int[] array , int si , int mid, int ei){
        int[] left = Arrays.copyOfRange(array,si,mid);
        int[] right = Arrays.copyOfRange(array,mid+1,ei);
        int i=0,j=0,k=si,swaps=0;// 9 8 5 7 6 1 9
        while(i< left.length && j<right.length){
            if(left[i]<=right[j]) array[k++]=left[i++];
            else {
                array[k++]=right[j++];
                swaps+= (mid+1)-(si+i);
            }
        }
        while(i<left.length) array[k++]=left[i++];
        while(j<right.length) array[k++]=right[j++];
        return swaps;
    }
    static int divide(int[] array,int si,int ei){
        int count =0;
        if(si<ei){
            int mid = (si+ei)/2;
            count+=divide(array,si,mid);
            count+=divide(array,mid+1,ei);
            count+=mergeAndCount(array,si,mid,ei);
        }
        return count;
    }
    public static int inversions(int[] arr){
        int k =0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]) k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int[] input = {9,8,5,7,6,1,9};
        System.out.println(inversions(input));
        System.out.println(divide(input,0,input.length-1));
    }
}
