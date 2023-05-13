// Quick sort - (Time Complexity - O()
package myPackage;

import java.util.Arrays;

public class AC_23 {
    static int partition(int[] array,int low,int high){
        int pivot = array[high];
        int i=low-1;

        for(int j=low;j<high;j++){
            if(array[j]<pivot){
                i++;
                // swap
                int temp = array[i];
                array[i]=array[j];
                array[j]=temp;
            }
        }
        i++;
        int temp = array[i];
        array[i]=array[high];
        array[high]=temp;
        return i;
    }
    static void quickSort(int[] array,int low,int high){
        if(low<high){
            int pivInd = partition(array,low,high);

            quickSort(array,low,pivInd-1);
            quickSort(array,pivInd+1,high);
        }
    }
    public static void main(String[] args) {
        int[] array = {6,3,9,5,8,2};
        int n= array.length;

        quickSort(array,0,n-1);
        System.out.println(Arrays.toString(array));
    }
}
