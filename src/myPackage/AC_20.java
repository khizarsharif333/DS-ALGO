package myPackage;

import java.util.*;

public class AC_20 {
    static void printPermutation(String str,String perm){
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0,i)+str.substring(i+1);
            printPermutation(newStr,perm+currChar);
        }
    }
    static boolean isSafe(int row,int col,char[][] board){
        // Horizontal
        for(int j=0;j<board.length;j++){
            if(board[row][j]=='Q'){
                return false;
            }
        }
        // Vertical
        for(int i=0;i<board.length;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        // Upper left
        int r = row;
        for(int c=col;c>=0 && r>=0;r--,c--){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        // Upper right
        for(int c=col;c< board.length && r>=0;r--,c++){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        // Lower left
        r = row;
        for(int c=col; c>=0 && r<board.length; r++, c--) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }
        // Lower right
        for(int c = col;c< board.length && r< board.length;r++,c++){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        return true;
    }
    static void saveBoard(char[][] board,List<List<String>> allBoards){
        String row = "";
        List<String> newBoard = new ArrayList<>();
        for(int i=0;i< board.length;i++){
            row="";
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='Q')
                    row+='Q';
                else
                    row+='.';
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }
    static void helper(char[][] board,List<List<String>> allBoards,int col){
        if(col== board.length){
            saveBoard(board,allBoards);
            return;
        }
        for(int row=0;row<board.length;row++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                helper(board, allBoards, col + 1);
                board[row][col] = '.';
            }
        }
    }
    static List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];

        helper(board , allBoards ,0);
        return allBoards;
    }
    public static void main(String[] args) {
        // printPermutation("ABC","");
        System.out.println(solveNQueens(4));
    }
}