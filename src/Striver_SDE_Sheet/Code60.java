package Striver_SDE_Sheet;

import java.util.ArrayList;
import java.util.List;

public class Code60 {
    public static List<String> wordBreak(String s, List<String> wordDict) {
        List<String> ans = new ArrayList<>();
        words(0,s,"","",wordDict,ans);
        return ans;
    }
    public static void words(int ind,String s,String str,String str1,List<String> wordDict,List<String> ans){
        if(ind==s.length()) {
            ans.add(str1);
            return;
        }
        if(ind>s.length()) return;
        for(int i=ind;i<s.length();i++){
            str += s.charAt(i);
            if(wordDict.contains(str)){
                String str2 = str1;
                if(str1.length() !=0) str1+=" "+str;
                else str1+=str;
                words(i+1,s,"",str1,wordDict,ans);
                str1 = str2;
            }
        }
    }
    public static void main(String[] args) {
        List<String> wordDict = new ArrayList<>();
        wordDict.add("god");
        wordDict.add("is");
        wordDict.add("now");
        wordDict.add("no");
        wordDict.add("where");
        wordDict.add("here");
        System.out.println(wordBreak("godisnowherenowhere",wordDict));
    }
}
