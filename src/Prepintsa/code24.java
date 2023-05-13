// Occurrence of a digit in a given number using Java
package Prepintsa;
import java.util.*;
public class code24 {
    static int occurrence(int num,int c){
        String str = Integer.toString(num);
        int count = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)-'0'==c){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(occurrence(num,c));
    }
}
