package Striver_SDE_Sheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Code56 {
    public static List<List<String>> solveNQueens(int n) {
        char[][] matrix = new char[n][n];
        List<List<String>> ans = new ArrayList<>();
        for(char[] val:matrix) Arrays.fill(val,'.');
        queens(0,matrix,ans);
        return ans;
    }
    public static void queens(int ind,char[][] matrix,List<List<String>> ans){
        if(ind == matrix.length){
            List<String> list = new ArrayList<>();
            for (char[] val : matrix){
                String str = new String(val);
                list.add(str);
            }
            ans.add(list);
            return;
        }
        for(int i=0;i<matrix.length;i++){
            if(valid(matrix,i,ind)){
                matrix[i][ind]='Q';
                queens(ind+1,matrix,ans);
                matrix[i][ind]='.';
            }
        }
    }
    public static boolean valid(char[][] matrix,int m,int n){
        int k = matrix.length;
        for(int j=n-1;j>=0;j--){
            if(matrix[m][j]=='Q') return false;
        }
        for(int i=m-1,j=n-1;i>=0 && j>=0;i--,j--){
            if(matrix[i][j]=='Q') return false;
        }
        for(int i=m+1,j=n-1;i<k && j>=0;i++,j--){
            if(matrix[i][j]=='Q') return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(solveNQueens(4));
    }
}
