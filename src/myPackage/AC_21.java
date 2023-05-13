package myPackage;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AC_21 {
    static boolean isSafe(char[][] board,int row,int col,int num){
        // for row and column
        for(int i=0;i< board.length;i++){
            if(board[i][col]==(char)(num+'0')){
                return false;
            }
            if(board[row][i]==(char)(num+'0')){
                return false;
            }
        }
        //for grid
        int sr=(row/3)*3;
        int cr=(col/3)*3;
        for(int i=0;i< sr+3;i++){
            for(int j=0;j< cr+3;j++){
                if(board[i][j]==(char)(num+'0')){
                    return false;
                }
            }
        }
        return true;
    }

    static boolean sudokuSolver1(char[][] board,int row,int col){
        if(row == board.length){
            System.out.println(board);
            return true;
        }
        int newRow =0;
        int newCol =0;
        if(col!= board.length-1){
            newRow=row;
            newCol=col+1;
        }
        else{
            newRow=row+1;
        }
        if(board[row][col]!='.'){
            if(sudokuSolver1(board,newRow,newCol)){
                return true;
            }
        }
        else{
            for(int i=1;i<=9;i++){
                if(isSafe(board,row,col,i)){
                    board[row][col]=(char)(i+'0');
                    if(sudokuSolver1(board,newRow,newCol)){
                        return true;
                    }
                    else{
                        board[row][col]='.';
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        char[][] board ={{'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4', '.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6' ,'.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}};
        sudokuSolver1(board,0,0);
    }
}
