package Striver_SDE_Sheet;

import java.util.Arrays;

public class Code17 {
    // TC will be exponential in this recursive approach
    // Approach 1 - Time exceeded
    public static int countPaths1(int i,int j,int n,int m){
        if(i==(n-1) && j==(m-1)) return 1;
        if(i>=n || j>=m) return 0;
        else return countPaths1(i+1,j,n,m) + countPaths1(i,j+1,n,m);
    }
    public static int uniquePaths1(int m, int n) {
        return countPaths1(0,0,n,m);
    }
    // Approach 2 - executed
    public static int countPaths(int i,int j,int n,int m,int[][] matrix){
        if(i==(m-1) && j==(n-1)) return 1;
        if(i>=m || j>=n) return 0;
        if(matrix[i][j]!=-1) return matrix[i][j];
        int temp = countPaths(i+1,j,n,m,matrix) + countPaths(i,j+1,n,m,matrix);
        matrix[i][j]=temp;
        return temp;
    }
    public static int uniquePaths(int m, int n) {
        int[][] matrix = new int[m][n];
        for(int[] list:matrix){
            Arrays.fill(list,-1);
        }
        return countPaths(0,0,n,m,matrix);
    }
    // Approach 3 TC-O(m-1)    SC-O(1)
    public static int uniquePaths2(int m, int n) {
        int N = m + n -2;
        int r = m - 1;
        int res = 1;
        for(int i=1;i<=r;i++){
            res = res * (N - r + i)/i;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(uniquePaths2(3,3));
    }
}
