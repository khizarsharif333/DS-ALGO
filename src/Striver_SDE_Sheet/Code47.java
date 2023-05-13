package Striver_SDE_Sheet;

public class Code47 {
    // TC-O(N) SC(9)
    public static int findMinimumCoins(int amount) {
        int[] array = {1,2,5,10,20,50,100,500,1000};
        int count = 0;
        int i=array.length-1;
        while (i>=0 && amount!=0){
            if(array[i]<=amount){
                amount -= array[i];
                count ++;
            }
            else{
                i--;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int amount = 96;
        System.out.println(findMinimumCoins(amount));
    }
}
