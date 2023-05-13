package Striver_SDE_Sheet;

public class Code69 {
    public static String reverseWords1(String s) {
        String[] array = s.trim().split(" ");
        String sb = "";
        for(int i= array.length-1;i>-1;i--){
            if(sb.isEmpty()){
                if(array[i].length()>0) sb = sb.concat(array[i]);
            }
            else {
                if(array[i].length()>0) sb = sb.concat(" "+array[i]);
            }
        }
        return sb;
    }
    public static String reverseWords(String s){
        String sb = "";
        s = s.concat(" ");
        int i,j=0;
        while(j<s.length()){
            while(j<s.length() && s.charAt(j)==' ') j++;
            i = j;
            while(j<s.length() && s.charAt(j)!=' ') j++;
            if(sb.isEmpty()) sb = sb.concat(s.substring(i,j));
            else sb = s.substring(i,j)+ " ".concat(sb);
            while(j<s.length() && s.charAt(j)==' ') j++;
        }
        return sb;
    }
    public static void main(String[] args) {
        System.out.println(reverseWords1("      the sky is blue          "));
        System.out.println(reverseWords("      the sky is blue          "));
    }
}
