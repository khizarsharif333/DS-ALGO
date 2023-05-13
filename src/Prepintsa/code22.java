// Java Program to convert Digits/Numbers to Words
package Prepintsa;

public class code22 {
    static void wordsToNumber(char[] num){
        int len = num.length;
        String[] singleDigits = {"zero","one","two","three","four","five","six","seven","eight","nine","ten",
                "eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String[] doubleDigits = {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        String[] tripleDigits = {"hundred","thousand"};
        int x= 0;
        if(len==1){
            System.out.print(singleDigits[num[x]-'0']);
            return;
        }
        while(x<len+1){
            if(len>=3){
                if(num[x]-'0'!=0){
                    System.out.print(singleDigits[num[x]-'0']+" ");
                    System.out.print(tripleDigits[len-3]+" ");
                }
                len--;
            }
            else{
                if (num[x] - '0' == 1) {
                    int num1 = (num[x] - '0') + (num[x + 1] - '0');
                    System.out.print(singleDigits[num1]);
                    return;
                }
                else if (num[x + 1] - '0' == 0) {
                    System.out.print(doubleDigits[num[x] - '0']);
                    return;
                }
                else {
                    System.out.print(doubleDigits[num[x] - '0']+" ");
                    System.out.print(singleDigits[num[x + 1] - '0']);
                    return;
                }
            }
            ++x;
        }
    }
    public static void main(String[] args) {
        wordsToNumber("9999".toCharArray());
    }
}
