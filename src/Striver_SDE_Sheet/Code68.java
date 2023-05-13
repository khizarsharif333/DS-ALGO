package Striver_SDE_Sheet;

import java.util.Arrays;

public class Code68 {
    public static int chessTournament(int[] positions, int n,  int c) {
        Arrays.sort(positions);
        int low = 1;
        int high = positions[n-1]-positions[0],result = 0;
        while(low<=high){
            int mid = (low+high) >>1;
            if(isPossible(positions,c,mid)){
                result = mid;
                low = mid+1;
            }
            else high = mid-1;
        }
        return result;
    }
    public static boolean isPossible(int[] array,int c,int mid){
        int cnt = 1,val = array[0];
        for(int i=1;i< array.length;i++){
            if((array[i]-val)>=mid){
                cnt++;
                val = array[i];
            }
            if(cnt==c) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {6,7,9,13,15,11};
        System.out.println(chessTournament(array,6,4));
    }
}
