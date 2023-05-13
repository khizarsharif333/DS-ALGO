package Striver_SDE_Sheet;

public class Code77 {
    public static int minCharsforPalindrome(String str) {
        int h = str.length()-1;boolean val = true;
        int i = 0;
        while(i<str.length()/2){
            if (str.charAt(i) != str.charAt(h)) {
                val = false;break;
            }
            i++;h--;
        }
        if(val) return 0;int count = 0,p = 0,k=0;i =0;
        for(int j=str.length()-1;j>i;j--){
            p = j;
            if(str.charAt(i)!=str.charAt(j)){
                k = j;
            }
            while(j>i && str.charAt(i)==str.charAt(j)){
                i++;j--;
            }
            if(j>i){
                j = p;i = 0;k = p;
            }
        }
        return str.length()-k;
    }
    public static void main(String[] args) {
        System.out.println(minCharsforPalindrome("abcbaffr"));
    }
}
