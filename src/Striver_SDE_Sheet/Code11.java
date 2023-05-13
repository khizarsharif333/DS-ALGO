package Striver_SDE_Sheet;

import java.util.ArrayList;
import java.util.Arrays;

public class Code11 {
    // Lot of Time and Space Complexity
    public static int[] missingAndRepeating1(ArrayList<Integer> arr, int n) {
        int[] array = new int[2];
        int[] array1 = new int[n+1];
        for(int i=0;i<n;i++){
            array1[arr.get(i)]+=1;
        }
        for(int i=1;i<=n;i++){
            if(array1[i]==2) array[1]=i;
            else if(array1[i]==0) array[0]=i;
        }
        return array;
    }
    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        int[] array = new int[2];
        int xor = arr.get(0);
        int x = 0;
        int y = 0;

        for(int i=1;i<n;i++){
            xor^=arr.get(i);
        }
        for(int i=1;i<=n;i++){
            xor^=i;
        }
        int setBit = xor & -xor;
        for(int i=0;i<n;i++){
            if((arr.get(i) & setBit)!=0) x= x^arr.get(i);
            else y^=arr.get(i);
        }
        for(int i=1;i<=n;i++){
            if((i & setBit)!=0) x= x ^i;
            else y^=i;
        }
        array[0]=x;
        array[1]=y;
        return array;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(3);
        arr.add(5);
        arr.add(4);
        arr.add(7);
        arr.add(6);
        arr.add(2);
        System.out.println(Arrays.toString(missingAndRepeating1(arr, 7)));
        System.out.println(Arrays.toString(missingAndRepeating(arr, 7)));
    }
}
