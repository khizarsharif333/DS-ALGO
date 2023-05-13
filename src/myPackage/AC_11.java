package myPackage;

import java.util.Scanner;

public class AC_11 {
    static void array2D(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the no.of rows and columns of the matrix: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] matrix = new int[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.print("Enter the elements of matrix: ");
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void array2d() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no.of rows and columns of the matrix: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] matrix = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (matrix[i][j] == x) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }
    static void spiralArray(){
        int[][] spiral = {{1,5,7,9,10,11},{6,10,12,13,20,21},{9,25,29,30,32,41},{15,55,59,63,68,70},{40,70,79,81,95,105}};
        int rowStart = 0;
        int colStart = 0;
        int rowEnd = 4;
        int colEnd = 5;
        while(rowStart<=rowEnd && colStart<=colEnd){
            for(int i=colStart;i<=colEnd;i++){
                System.out.print(spiral[rowStart][i]+" ");
            }
            rowStart++;
            for(int i=rowStart;i<=rowEnd;i++){
                System.out.print(spiral[i][colEnd]+" ");
            }
            colEnd--;
            for(int i=colEnd;i>=colStart;i--){
                System.out.print(spiral[rowEnd][i]+" ");
            }
            rowEnd--;
            for(int i=rowEnd;i>=rowStart;i--){
                System.out.print(spiral[i][colStart]+" ");
            }
            colStart++;
        }
    }
    static void transpose(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no.of rows and columns of the matrix: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] matrix = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       // array2D();
       // array2d();
        // spiralArray();
        transpose();
    }
}
