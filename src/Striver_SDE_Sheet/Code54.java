package Striver_SDE_Sheet;

import java.util.ArrayList;
import java.util.List;

public class Code54 {
    // Naive
    public static void subsets(String str , String dum,ArrayList<String> array){
        if(0==str.length()){
            array.add(dum);
            return;
        }
        for(int i=0;i<str.length();i++){
            char cur = str.charAt(i);
            String newStr = str.substring(0,i)+str.substring(i+1);
            subsets(newStr,dum+cur,array);
        }
    }
    public static String getPermutation1(int n, int k) {
        String str = "";
        for(int i=1;i<=n;i++){
            str+=i;
        }
        ArrayList<String> array = new ArrayList<>();
        subsets(str,"",array);
        return array.get(k-1);
    }
    // Optimal
    public static String getPermutation(int n,int k){
        String ans = "";
        int fact = 1;
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<n;i++){
            fact = fact*i;
            list.add(i);
        }
        list.add(n);
        k = k-1;
        while(true){
            ans = ans + list.get(k/fact);
            list.remove(k/fact);
            if(list.size()==0) break;
            k = k%fact;
            fact = fact/list.size();
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(getPermutation(3,3));
    }
}
