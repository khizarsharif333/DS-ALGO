package myPackage;

import java.util.Scanner;

public class AC_12 {
    static void Strings(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Hello "+name);
        System.out.println(" "+name.length());
        for(int i=0;i<name.length();i++){
            System.out.print(name.charAt(i)+" ");
        }
    }
    static void Strings2(){
        /*String name1 = "Tony";
        String name2 = "Tony";
        if(name1.compareTo(name2)==0){
            System.out.println("Both strings are equal");
        }
        else{
            System.out.println("Both strings are not equal ");
        }
        if(name1.equals(name2)){
            System.out.println("Both strings are equal");
        }
        else{
            System.out.println("Both strings are not equal ");
        }*/
        if(new String("Tony") == new String("Tony")){
            System.out.println("Both strings are equal");
        }
        else{
            System.out.println("Both strings are not equal");
        }
    }
    static void Strings3(){
        String str = "My name is Khizar Sharif";
        System.out.println(str.substring(18));
    }
    static void Strings4(){
        String str = "123";
        int n = Integer.parseInt(str);
        System.out.println(n*2);
        int n1 = 1123;
        String str1 = Integer.toString(n1);
        System.out.println(str1+"khizar");
    }
    static void Strings5(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n =sc.nextInt();
        String[] str = new String[n];
        for(int i=0;i<n;i++){
            str[i]=sc.next();
        }
        int p =0;
        for(int j=0;j<n;j++){
            p+=str[j].length();
        }
        System.out.println(p);
    }
    static void Strings6(){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = "";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='e'){
                result +='i';
            }
            else{
                result +=str.charAt(i);
            }
        }
        System.out.println(result);
    }
    static void Strings7(){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String userName = "";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='@'){
                break;
            }
            else{
                userName += str.charAt(i);
            }
        }
        System.out.println(userName);
    }
    public static void main(String[] args) {
        // Strings();
        // Strings2();
        // Strings3();
        // Strings4();
        // Strings5();
        // Strings6();
        Strings7();
    }
}
