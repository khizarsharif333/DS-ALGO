package myPackage;

import java.util.ArrayList;
import java.util.HashSet;

public class AC_18 {
    public static int first = -1;
    public static int last = -1;
    public static boolean[] map = new boolean[26];
    public static String[] keypad = {"0","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static int k = 1;
    static void towerOfHanoi(int n,String src,String hel,String dest){
        if(n==1){
            System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
            return;
        }
        towerOfHanoi(n-1,src,dest,hel);
        System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
        towerOfHanoi(n-1,hel,src,dest);
    }
    static void reverseOfString(String str,int size){
        if(size==0){
            System.out.print(str.charAt(size));
            return;
        }
        System.out.print(str.charAt(size));
        reverseOfString(str,size-1);
    }
    static void firstAndLastOccurrence(String str,char a,int n){
        if(n==str.length()){
            System.out.println("First - "+first+" Last - "+last);
            return;
        }
        if(str.charAt(n)==a){
            if(first<0){
                first=n;
            }
            else{
                last=n;
            }
        }
        firstAndLastOccurrence(str,a,n+1);
    }
    static boolean sortedArrayOrNot(int[] array,int ind){
        if(ind == array.length-1){
            return true;
        }
        if(array[ind]>=array[ind+1]){
            return false;
        }
        return sortedArrayOrNot(array,ind+1);
    }
    static void moveXtoLast(String str,int ind,int count,String newString){
        if(ind==str.length()){
            for(int i=0;i<count;i++){
                newString +='x';
            }
            System.out.println(newString);
            return;
        }
        if(str.charAt(ind)=='x'){
            count++;
            moveXtoLast(str,ind+1,count,newString);
        }
        else{
            newString+=str.charAt(ind);
            moveXtoLast(str,ind+1,count,newString);
        }
    }
    static void removeDuplicates(String str,int ind,String str1){
        if(ind==str.length()){
            System.out.println(str1);
            return;
        }
        char currentChar = str.charAt(ind);
        int p= currentChar -'a';
        if(map[p]){
            removeDuplicates(str,ind+1,str1);
        }
        else{
            str1+=currentChar;
            map[p]=true;
            removeDuplicates(str,ind+1,str1);
        }
    }
    static void substring(String str,int ind,String str1){
        if(ind==str.length()){
            System.out.println(str1);
            return;
        }
        char curtChar = str.charAt(ind);

        // To be
        substring(str,ind+1,str1+curtChar);

        // not to be
        substring(str,ind+1,str1);
    }
    public static void subArrays(ArrayList<ArrayList<Integer>> array, ArrayList<Integer> list, int[] str, int ind){
        if(ind==str.length){
            array.add(new ArrayList<>(list));
            return;
        }
        int num = str[ind];
        list.add(num);
        subArrays(array,list,str,ind+1);
        list.remove(list.size()-1);
        subArrays(array,list,str,ind+1);
    }
    public static ArrayList<ArrayList<Integer>> subArrays0(ArrayList<Integer> arr){
        ArrayList<ArrayList<Integer>> array1 = new ArrayList<>();
        for(int i=0;i<arr.size();i++){
            ArrayList<Integer> array2 = new ArrayList<>();
            array2.add(arr.get(i));array1.add(new ArrayList<>(array2));
            for(int j=i+1;j<arr.size();j++){
                array2.add(arr.get(j));
                array1.add(new ArrayList<>(array2));
            }
        }
        //System.out.println(array1);
        return array1;
    }
    static void substringDuplicates(String str,int ind,String str1,HashSet<String> hashSet){
        if(ind==str.length()){
            if (!hashSet.contains(str1)) {
                System.out.println(str1);
                hashSet.add(str1);
            }
            return;
        }
        char curtChar = str.charAt(ind);

        // To be
        substringDuplicates(str,ind+1,str1+curtChar,hashSet);

        // not to be
        substringDuplicates(str,ind+1,str1,hashSet);
    }
    static void keypadCombinations(String str,int ind,String combination){
        if(ind==str.length()){
            System.out.printf(combination+" %d",k);
            k++;
            System.out.println();
            return;
        }
        char currentCharacter = str.charAt(ind);
        String mapping = keypad[currentCharacter-'0'];

        for(int i=0;i<mapping.length();i++){
            keypadCombinations(str,ind+1,combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        // towerOfHanoi(4,"S","H","D");
        // String str = "apple";
        // reverseOfString(str,str.length()-1);
        // firstAndLastOccurrence(str,'p',0);
        // int[] array = {1,0,3,4,45};
        // System.out.println(sortedArrayOrNot(array,0));
        // moveXtoLast("axbcxxd",0,0,"");
        // removeDuplicates("aabbbcccdddd",0,"");
        substring("abc",0,"");
        /*ArrayList<ArrayList<Integer>> set = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        int[] nums = {1,2,2};
        subArrays(set,list,nums,0);
        System.out.println(set);*/
        // String str = "aabb";
        // HashSet<String> hashSet = new HashSet<>();
        // substringDuplicates(str,0,"",hashSet);
        // keypadCombinations("123",0,"");
    }
}
