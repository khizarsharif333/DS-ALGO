package myPackage;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class AC_25 {
    static void userNames(){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<3;i++){
            System.out.println("Enter the name: ");
            String str=sc.next();
            list.add(str);
        }
        for(String ele:list) System.out.print(ele+" ");
    }
    static void maxAndMin(ArrayList<Integer> arrayList){
        Collections.sort(arrayList);
        System.out.println("The minimum element is "+arrayList.get(0));
        System.out.println("The maximum element is "+arrayList.get(arrayList.size()-1));
    }
    static void sortedOrNot(ArrayList<Integer> list){
        boolean pp = true;
        for(int i=0;i<list.size()-1;i++){
            if (list.get(i) > list.get(i + 1)) {
                pp = false;
                break;
            }
        }
        if(pp) System.out.println("Sorted");
        else System.out.println("Not sorted");
    }
    static ArrayList<ArrayList<Integer>> twoD(){
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i=0;i<3;i++){
            ArrayList<Integer> list1 = new ArrayList<>();
            for(int j=0;j<4;j++){
                int n=sc.nextInt();
                list1.add(n);
            }
            list.add(list1);
        }
        return list;
    }
    static void spiral(ArrayList<ArrayList<Integer>> list){
        int rowStart = 0;
        int rowEnd = 4;
        int colStart = 0;
        int colEnd = 5;
        while(rowStart<=rowEnd && colStart<=colEnd){
            for(int i=colStart;i<=colEnd;i++) {
                ArrayList<Integer> list1 = list.get(rowStart);
                System.out.print(list1.get(i)+" ");
            }
            rowStart++;
            for(int i=rowStart;i<=rowEnd;i++) {
                ArrayList<Integer> list1 = list.get(i);
                System.out.print(list1.get(colEnd)+" ");
            }
            colEnd--;
            for(int i=colEnd;i>=colStart;i--) {
                ArrayList<Integer> list1 = list.get(rowEnd);
                System.out.print(list1.get(i)+" ");
            }
            rowEnd--;
            for(int i=rowEnd;i>=rowStart;i--) {
                ArrayList<Integer> list1 = list.get(i);
                System.out.print(list1.get(colStart)+" ");
            }
            colStart++;
        }
    }
    static void transpose(ArrayList<ArrayList<Integer>> list){
        int row = list.size();
        ArrayList<Integer> list1 = list.get(0);
        int col = list1.size();
        for(int j=0;j<col;j++){
            for (ArrayList<Integer> list2 : list) {
                System.out.print(list2.get(j) + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // userNames();
        ArrayList<Integer> list = new ArrayList<>();
        // Add elements
        list.add(0);
        list.add(2);
        list.add(3);
        // Get elements
        // int element = list.get(1);
        // Add elements in between
        list.add(1,1);
        // Set element
        list.set(2,5);
        // Delete element
        list.remove(2);
        // Size of array list
        // System.out.println(list.size());
        // iterate
        // for(int element:list) System.out.println(element);
        // for(int i=0;i<list.size();i++) System.out.println(list.get(i));
        // sort elements
        // Collections.sort(list);
        // System.out.println(list);
        // maxAndMin(list);
        // sortedOrNot(list);
        // spiral(twoD());
        transpose(twoD());
    }
}
