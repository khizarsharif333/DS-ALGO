// Finding number of integers which has exactly X divisors
package Prepintsa;

import java.util.ArrayList;
import java.util.List;

public class code25 {
    static List<Integer> divisors(int n, int b){
        List<Integer> array = new ArrayList<>();
        int count1 = 0;
        for(int i=1;i<=n;i++){
            int count =0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==b){
                array.add(i);
            }
        }
        return array;
    }
    public static void main(String[] args) {
        System.out.println(divisors(99,9));
    }
}
