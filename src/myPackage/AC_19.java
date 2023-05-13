package myPackage;

import java.util.ArrayList;

public class AC_19 {
    public static void permutationArray(ArrayList<ArrayList<Integer>> array,ArrayList<Integer> list,int[] str){
        if(list.size()==str.length){
            array.add(new ArrayList<>(list));
        }
        else {
            for (int j : str) {
                if (list.contains(j)) continue;
                list.add(j);
                permutationArray(array, list, str);
                list.remove(list.size() - 1);
            }
        }
    }
    static void printPermutation(String str,String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currentChar = str.charAt(i);
            String newStr = str.substring(0,i)+str.substring(i+1);
            printPermutation(newStr,permutation+currentChar);
        }
    }
    static int totalPaths(int i,int j,int m,int n){
        if(i==m+1 || j==n+1){
            return 0;
        }
        if(i==m && j==n){
            return 1;
        }
        // Move right ways
        int rightWays = totalPaths(i,j+1,m,n);

        // Move downwards
        int downwards = totalPaths(i+1,j,m,n);

        return rightWays+downwards;
    }
    static int arrangeTiles(int n,int m){
        if(m==n){
            return 2;
        }
        if(n<m){
            return 1;
        }
        // Place Vertically
        int vertArrange = arrangeTiles(n-m,m);

        // Place Horizontally
        int horizonArrange = arrangeTiles(n-1,m);

        return vertArrange+horizonArrange;
    }
    static int party(int n){
        if(n<=1){
            return 1;
        }
        // single
        int way1 = party(n-1);

        // Pairs
        int way2 = (n-1) * party(n-2);

        return way1 +way2;
    }
    static void printSubset(ArrayList<Integer> subset){
        for (Integer integer : subset) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
    static void subSet(int n,ArrayList<Integer> subset){
        if(n==0){
            printSubset(subset);
            return;
        }
        // Will be
        subset.add(n);
        subSet(n-1,subset);

        // Will not be
        subset.remove(subset.size()-1);
        subSet(n-1,subset);
    }
    public static void main(String[] args) {
        // printPermutation("abcd","");
        // System.out.println(totalPaths(1,1,3,3));
        // System.out.println(arrangeTiles(3,2));
        // System.out.println(party(3));
        ArrayList<Integer> subset = new ArrayList<>();
        subSet(2,subset);
    }
}
