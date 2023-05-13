package Striver_SDE_Sheet;

import java.util.HashMap;

public class Code71 {
    public static int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int res = 0;
        for(int i=0;i<s.length();i++){
            if(i!=s.length()-1 && map.get(s.charAt(i))<map.get(s.charAt(i+1))) res-=map.get(s.charAt(i));
            else res+=map.get(s.charAt(i));
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(romanToInt("LVIII"));
    }
}