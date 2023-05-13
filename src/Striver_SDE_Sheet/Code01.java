package Striver_SDE_Sheet;

import java.util.Arrays;

public class Code01 {
    // Naive
    public static void setZeroes2(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    for(int k=0;k< matrix.length;k++){
                        if(matrix[k][j]!=0) matrix[k][j]=-1;
                    }
                    for(int k=0;k<matrix[0].length;k++){
                        if(matrix[i][k]!=0) matrix[i][k]=-1;
                    }
                }
            }
        }
        for(int i=0;i<matrix.length;i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]==-1) matrix[i][j]=0;
            }
        }
    }
    // Better
    public static void setZeroes1(int[][] matrix) {
        int[] row = new int[matrix.length];
        int[] col = new int[matrix[0].length];
        Arrays.fill(row,-1);
        Arrays.fill(col,-1);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = 0;
                    col[j] = 0;
                }
            }
        }
        for(int i=0;i<matrix.length;i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(row[i]==0 || col[j]==0) matrix[i][j]=0;
            }
        }
    }
    // optimal
    public static void setZeroes(int[][] matrix) {
        int col0 = 1;
        for (int i = 0; i < matrix.length; i++) {
            if(matrix[i][0]==0) col0 = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = matrix[0][j] = 0;
                }
            }
        }
        for(int i= matrix.length-1;i>=0;i--){
            for(int j=matrix[0].length-1;j>=0;j--){
                if(matrix[i][0]==0 || matrix[0][j]==0) matrix[i][j]=0;
            }
            if(col0 == 0) matrix[i][0]=0;
        }
    }
    public static void main(String[] args) {

    }
}
