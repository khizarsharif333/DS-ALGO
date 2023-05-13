package Striver_SDE_Sheet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Code23 {
    // Naive approach TC-O(N2) SC-O(1)
    public static int subarraysXor1(ArrayList<Integer> arr, int x) {
        int count =0;
        for(int i=0;i<arr.size();i++){
            int xor = 0;
            for(int j=i;j<arr.size();j++){
                xor^= arr.get(j);
                if(xor==x){
                    count++;
                }
            }
        }
        return count;
    }
    // Optimal TC-O(NLOGN) SC-O(N)
    public static int subarraysXor(ArrayList<Integer> arr, int x) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        int xorr = 0;
        for(int val:arr){
            xorr = xorr ^ val;
            if(xorr==x) count++;
            if(map.get(xorr^x)!=null) count+=map.get(xorr^x);
            if(map.containsKey(xorr)) map.put(xorr,map.get(xorr)+1);
            else map.put(xorr,1);
        }
        return count;
    }
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(5);//5 2 9
        array.add(2);
        array.add(9);
        System.out.println(subarraysXor(array,7));
    }
}
