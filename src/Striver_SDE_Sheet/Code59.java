package Striver_SDE_Sheet;

import java.util.ArrayList;

public class Code59 {
    public static ArrayList<ArrayList<Integer>> ratInAMaze1(int[][] maze, int n) {
        ArrayList<ArrayList<Integer>> array = new ArrayList<>();
        if(maze[0][0]==1) ratPaths1(maze,n,0,0,new int[n][n],array);
        return array;
    }
    // Lexical Order (i.e.Ascending D|L|R|U)
    // Naive
    public static void ratPaths1(int[][] maze,int n,int row,int col,int[][] res,ArrayList<ArrayList<Integer>> result){
        if(row==n-1 && col==n-1){
            res[row][col]=1;
            ArrayList<Integer> new1 = new ArrayList<>();
            for(int[] val:res) {
                for(int value:val){
                    new1.add(value);
                }
            }
            result.add(new1);
            return;
        }
        if(row<0 || col<0 || row>=n || col>=n || maze[row][col]==0|| (res[row][col]==1)) return;
        else res[row][col]=1;
        ratPaths1(maze,n,row+1,col,res,result);
        ratPaths1(maze,n,row,col-1,res,result);
        ratPaths1(maze,n,row,col+1,res,result);
        ratPaths1(maze,n,row-1,col,res,result);
        res[row][col]=0;
    }
    public static void main(String[] args) {
        int[][] maze = {{1, 0,1},
                        {1 ,1, 1},
                        {1, 1, 1}};
        System.out.println(ratInAMaze1(maze,3));
    }
}
