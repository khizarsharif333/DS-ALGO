package myPackage;

import java.util.Scanner;

public class AC_15 {
    static void getBit(){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int pos = sc.nextInt();
        int bitMask = 1<<pos;
        int bit = 0;
        if((bitMask & number) != 0){
            bit =1;
            System.out.println(bit);
        }else System.out.println(bit);
    }
    static void setBit(){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int pos = sc.nextInt();
        int bitMask = 1<<pos;
        System.out.println((bitMask | number));
    }
    static void clearBit(){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int pos = sc.nextInt();
        int bitMask = 1<<pos;
        System.out.println((~bitMask & number));
    }
    static void updateBit(){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int pos = sc.nextInt();
        int bitMask = 1<<pos;
        boolean bit = (bitMask & number) != 0;
        if(bit) {
            System.out.println((~bitMask & number));
        }
        else{
            System.out.println((bitMask | number));
        }
    }
    static void powerOfTwo(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = Integer.toBinaryString(n);
        System.out.println(str);
        int count =0;
        for(int i=0;i<str.length();i++){
            int k = Integer.parseInt(String.valueOf(str.charAt(i)));
            if(k==1){
                count++;
            }
        }
        if(count>1){
            System.out.println("No");
        }else System.out.println("Yes");
    }
    static void toggle(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = sc.nextInt();
        int bitMask = 1<<pos;
        boolean bit = (bitMask & n)!=0;
        if(bit){
            System.out.println(~bitMask & n);
        }else{
            System.out.println(bitMask | n);
        }
    }
    static void countOfOnes(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = Integer.toBinaryString(n);
        System.out.println(str);
        int count =0;
        for(int i=0;i<str.length();i++){
            int k = Integer.parseInt(String.valueOf(str.charAt(i)));
            if(k==1){
                count++;
            }
        }
        System.out.println("The no.of ones in the number are: "+count);
    }
    static int binaryToDecimal(){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        return Integer.parseInt(str,2);
    }
    static String decimalToBinary(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        return Integer.toBinaryString(n);
    }
    public static void main(String[] args) {
        // getBit();
        // setBit();
        // clearBit();
        // updateBit();
        // powerOfTwo();
        // toggle();
        // countOfOnes();
        // System.out.println(binaryToDecimal());
        System.out.println(decimalToBinary());
    }
}
