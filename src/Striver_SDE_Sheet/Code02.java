package Striver_SDE_Sheet;

import java.util.ArrayList;
import java.util.List;

public class Code02 {
    public List<List<Integer>> generate1(int numRows) {
        List<List<Integer>> array = new ArrayList<>();
        List<Integer> array1 = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            array1.add(0,1);
            for(int j=1;j<array1.size()-1;j++){
                array1.set(j,array1.get(j)+array1.get(j+1));
            }
            array.add(new ArrayList<>(array1));
        }
        return array;
    }
    public static void main(String[] args) {
        Code02 c2 = new Code02();
        System.out.println(c2.generate1(8));
    }
}