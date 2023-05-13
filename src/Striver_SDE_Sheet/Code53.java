package Striver_SDE_Sheet;

import java.util.ArrayList;
import java.util.List;

public class Code53 {
    public static boolean palindrome(String str,int start,int end){
        while(start<=end){
            if(str.charAt(start++)!=str.charAt(end--)) return false;
        }
        return true;
    }
    public static void subArray(int ind, String s, List<String> list, List<List<String>> ans){
        if(ind==s.length()){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=ind;i<s.length();i++){
            if(palindrome(s,ind,i)){
                list.add(s.substring(ind,i+1));
                subArray(i+1,s,list,ans);
                list.remove(list.size()-1);
            }
        }
    }
    public static List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        subArray(0,s,new ArrayList<>(),ans);
        return ans;
    }

    public static void main(String[] args) {
        String str = "aab";
        System.out.println(partition(str));
    }
}
