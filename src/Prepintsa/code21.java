// Java Code to find number of digits in an integer
package Prepintsa;
import java.util.*;

public class code21 {
    static void noOfDigits(int num){
        String str = Integer.toString(num);
        System.out.println(str.length());
    }
    static void noOfDigits1(int num){
        // declare a variable to count number of digits
        int digit = 0;
        while(num != 0)
        {
            // pick last digit of the number and count one by one
            digit++;
            num = num / 10;
        }
        // display number of digits
        System.out.print("Number of Digits = "+digit);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        noOfDigits(num);
        noOfDigits1(num);
    }
}
