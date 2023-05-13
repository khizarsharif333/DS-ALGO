// Recursive Program to find Small Element of the array in Java
package Prepintsa;

public class code30 {
    static int smallest(int[] array,int i,int min){
        if(i==array.length){
            return min;
        }
        if(min>array[i]) min=array[i];
        return smallest(array,i+1,min);
    }
    public static void main(String[] args) {
        int[] array = {1,233,3,4,-333,99};
        System.out.println(smallest(array,1,array[0]));
    }
}
