package Striver_SDE_Sheet;

public class Code72 {
    public static int myAtoi(String s) {
        if(s.length()==0) return 0;
        long res = 0L;
        int sign = 1,i = 0;
        while(i<s.length() && s.charAt(i)==' ') i++;
        if(i<s.length() && s.charAt(i)=='+'){
            i++;
        }
        else if(i<s.length() && s.charAt(i)=='-'){
            sign = -1;
            i++;
        }
        while(i<s.length() && s.charAt(i)>='0' && s.charAt(i)<='9'){
            if(res > 2147483647) break;
            else res = 10*res + Integer.parseInt(String.valueOf(s.charAt(i)));
            i++;
        }
        res = sign*res;
        if(sign<0){
            if(res<-2147483648) return -2147483648;
            else return (int) res;
        }
        else{
            if(res>2147483647) return 2147483647;
            else return (int) res;
        }
    }
    public static void main(String[] args) {
        System.out.println(myAtoi("9223372036854775808"));
    }
}