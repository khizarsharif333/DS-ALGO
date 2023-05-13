// Find the prime numbers between 1 and 100
package Prepintsa;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class code20 {
    static boolean primesOrNot(int n){
        if(n<2){
            return false;
        }
        else{
            for(int i=2;i<n/2;i++){
                if(n%i==0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        int a =1;
        int b = 100;
        for(int i=a;i<=b;i++){
            if(primesOrNot(i)){
                array.add(i);
            }
        }
        System.out.println(array);
    }
}
