// Recursive Program to find Large Element of the array in Java
package Prepintsa;

public class code29 {
    static int largest(int[] array,int i,int max){
        if(i==array.length){
            return max;
        }
        if(max<array[i]) max=array[i];
        return largest(array,i+1,max);
    }
    public static void main(String[] args) {
        int[] array = {1,233,3,4,5,99};
        System.out.println(largest(array,1,array[0]));
    }
}
