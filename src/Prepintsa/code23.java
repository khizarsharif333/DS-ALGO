// Counting number of days in a given month of a year
package Prepintsa;
import java.util.*;
public class code23 {
    static void noOfDays(int month,int year){
        int[] array = {31,28,31,30,31,30,31,31,30,31,30,31};
        if((month==2)&&((year%4==0)||(year%100==0)&&(year%400==0))){
            System.out.println("No of days is 29!");
        }
        else{
            System.out.printf("No of days is %d!",array[month-1]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int year = sc.nextInt();
        noOfDays(month,year);
    }
}
