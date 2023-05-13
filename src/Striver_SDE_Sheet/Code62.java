package Striver_SDE_Sheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Code62 {
    // Naive TC-O(M*N)+O(M*NLOGM*N) SC-O(M*N)
    public static int getMedian1(ArrayList<ArrayList<Integer>> matrix){
        int m = matrix.size();
        int n = matrix.get(0).size();
        ArrayList<Integer> array = new ArrayList<>();
        for(ArrayList<Integer> value:matrix){
            array.addAll(value);
        }
        Collections.sort(array);
        int siz = array.size();//if(siz%2==1)
        return array.get(siz/2);
        // else return (array.get(siz/2)+(array.get(siz/2)+1))/2;
    }
    // Optimal
    public static int lesserThanMid(ArrayList<Integer> al,int mid,int siz){
        int l = 0,h = siz-1;
        while(l<=h){
            int md = (l+h)/2;
            if(al.get(md)>mid) h = md-1;
            else l = md+1;
        }
        return l;
    }
    public static int getMedian(ArrayList<ArrayList<Integer>> matrix){
        int low = 1;
        int high = 1000000000;
        int row = matrix.size();
        int col = matrix.get(0).size();
        while(low<=high){
            int mid = (low + high)/2;
            int cnt = 0;
            for (ArrayList<Integer> integers : matrix) {
                cnt += lesserThanMid(integers, mid, col);
            }
            if(cnt<=(row*col)/2) low = mid+1;
            else high = mid-1;
        }
        return low;
    }
    public static void main(String[] args) {
        // System.out.println(getMedian());
    }
}
