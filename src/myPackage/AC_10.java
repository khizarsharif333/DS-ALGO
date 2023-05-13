package myPackage;

import java.util.Scanner;

public class AC_10 {
    static void array1(int n){
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[n];
        for(int j=0;j<n;j++){
            System.out.print("Enter the element: ");
            marks[j]=sc.nextInt();
        }
        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();
        for(int j=0;j<marks.length;j++){
            if(x==marks[j]){
                System.out.println("The index is "+j);
                break;
            }
        }
    }
    static void array2(){
        String[] names = {"khizar","Khalid"};
        for (String name : names) {
            System.out.println(name);
        }
    }
    static void array3(){
        int[] numbers = {10,20,99,40,50};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
        System.out.printf("The large number is %d and small is %d",max,min);
    }
    static void array4(){
        int[] ab = {10,20,30,45,55};
        boolean cd = true;
        for(int i=0;i<ab.length-1;i++){
            if(ab[i]>ab[i+1]){
                cd = false;
                break;
            }
        }
        if(cd){
            System.out.println("Array in Sorted order!");
        }
        else{
            System.out.println("Array not in Sorted order!");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the size  of the array: ");
        // int n  = sc.nextInt();
        // array1(n);
        // array2();
        // array3();
        array4();
    }
}
