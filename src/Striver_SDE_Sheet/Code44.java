package Striver_SDE_Sheet;

import java.util.ArrayList;
import java.util.Arrays;

public class Code44 {
    public static void insertionSort(int[] at,int[] dt){
        for(int i=1;i<at.length;i++){
            int current = at[i];
            int current1 = dt[i];
            int j= i-1;
            while(j>=0 && at[j]>current){
                at[j+1]= at[j];
                dt[j+1]= dt[j];
                j--;
            }
            at[j+1]=current;
            dt[j+1]=current1;
        }
        // System.out.println(Arrays.toString(at));
        // System.out.println(Arrays.toString(dt));
    }
    // Naive
    public static int calculateMinPatforms1(int at[], int dt[], int n) {
        ArrayList<Integer> list = new ArrayList<>();
        insertionSort(at,dt);
        int count =1;
        list.add(dt[0]);
        for(int i=1;i<n;i++){
            boolean val = true;
            for(int j=0;j<list.size();j++){
                if(at[i]>list.get(j)){
                    list.remove(j);
                    list.add(dt[i]);
                    val = false;
                    break;
                }
            }
            if(val){
                list.add(dt[i]);
                count++;
            }
        }
        return count;
    }
    // Optimal
    public static int calculateMinPatforms(int at[], int dt[], int n) {
        Arrays.sort(at);
        Arrays.sort(dt);
        int result = 1,platform = 1;
        int i=1,j=0;
        while(i<n && j<n){
            if(at[i]<=dt[j]){
                platform++;
                i++;
            }
            else if(at[i]>dt[j]){
                platform--;
                j++;
            }
            if(result<platform) result = platform;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] at = {41 ,1616 ,297, 2042, 1013, 987 ,2050, 525, 636 ,109};
        int[] dt = {2275, 2076 ,1580 ,2144 ,1231 ,1672, 2137, 1016, 2234, 1043};
        System.out.println(calculateMinPatforms(at,dt,10));
    }
}
