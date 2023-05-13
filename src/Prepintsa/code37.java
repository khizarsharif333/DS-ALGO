package Prepintsa;

import java.util.ArrayList;
import java.util.List;

public class code37 {
    static List<Integer> array = new ArrayList<>();
    static void subSets(String str,String newStr,int i){
        if(i==str.length()) {
            int count =0;
            for(int j=0;j<newStr.length();j++){
                count+=newStr.charAt(j)-'0';
            }
            array.add(count);
            return;
        }
        char cur = str.charAt(i);
        subSets(str,newStr+cur,i+1);
        subSets(str,newStr,i+1);
    }
    static void subsetSums(int[] arr, int l, int r, int sum)
    {
        if (l > r) {
            System.out.print(sum + " ");
            return;
        }

        subsetSums(arr, l + 1, r, sum + arr[l]);

        subsetSums(arr, l + 1, r, sum);
    }
    public static void main(String[] args) {
        int[] array1 = {5,4,3,1};
        String str = "";
        for(int element:array1){
            str+=element;
        }
        subSets(str,"",0);
        subsetSums(array1,0, array1.length-1,0 );
        System.out.println(array);
    }
}
