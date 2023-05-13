package Striver_SDE_Sheet;

public class Code67 {
    // Optimal
    public static long ayushGivesNinjatest(int n, int m, int[] time) {
        long low = Integer.MIN_VALUE;
        long high = 0,res = 0;
        for(int val:time){
            low = Math.max(low,val);
            high += val;
        }
        while(low<=high){
            long mid = low + (high - low)/2;
            long days = 1,curTime = 0;
            for(int val:time){
                curTime+=val;
                if(curTime>mid){
                    days++;
                    curTime = val;
                }
            }
            if(days <= n){
                res = mid;
                high = mid-1;
            }
            else low = mid+1;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] array = {12,34,67,90};
        System.out.println(ayushGivesNinjatest(2,4,array));
    }
}
