package myPackage;

import java.util.Scanner;
// String Builders

public class AC_13 {
    static void stringBuilder(){
        StringBuilder strBr = new StringBuilder("Naruto");

        //Get Character-(Returns the character at the given index)
        System.out.println(strBr.charAt(2));

        //Set Character-(Replace the character with the provided character)
        strBr.setCharAt(0,'B');
        System.out.println(strBr);

        //Insert Character-(Insert's in the assigned index)
        strBr.insert(1,"o");
        System.out.println(strBr);

        //Delete Character-(Deletes the character at the provided index)
        strBr.delete(2,3);
        System.out.println(strBr);

        //Append Character-(Insert character at the end of the string)
        strBr.append("Sarada");
        System.out.println(strBr);
    }
    static void reverseString(){
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder("odlanor");
        for(int i=0;i<str.length()/2;i++){
            char ch = str.charAt(str.length()-1-i);
            str.setCharAt(str.length()-1-i, str.charAt(i));
            str.setCharAt(i,ch);
        }
        System.out.println(str);
    }
    static void Strings6(){
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.next());
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='e'){
                str.setCharAt(i,'i');
            }
        }
        System.out.println(str);
    }
    static void Strings7(){
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.next());
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='@') {
                str.delete(i,str.length());
            }
        }
        System.out.println(str);
    }
    public static void main(String[] args) {
        //stringBuilder();
        // reverseString();
        // Strings6();
        Strings7();
    }
}
