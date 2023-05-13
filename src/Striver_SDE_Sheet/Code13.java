package Striver_SDE_Sheet;

import java.util.ArrayList;

public class Code13 {
    // Leetcode
    public static boolean searchMatrix1(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0;i<m;i++){
            if(i+1<m && matrix[i+1][0]<=target) continue;
            else {
                for (int j = 0; j < n; j++) {
                    if (matrix[i][j] == target) return true;
                    else if (matrix[i][j]>target) {
                        return false;
                    }
                }
            }
        }
        return false;
    }
    // CodeStudio
    static boolean findTargetInMatrix(ArrayList<ArrayList<Integer>> mat, int m, int n, int target) {
        int low = 0;
        int high = (m*n)-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            ArrayList<Integer> list = mat.get(mid/n);
            if(list.get(mid%n)==target) return true;
            else if(list.get(mid%n)>target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return false;
    }
    // Optimal with time Complexity - O(log(m*n))
    public static boolean searchMatrix(int[][] matrix,int target){
        int m = matrix.length;
        int n = matrix[0].length;

        int low = 0;
        int high = (m*n)-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(matrix[mid/n][mid%n]==target) return true;
            else if(matrix[mid/n][mid%n]>target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix(matrix,3));
    }
}
