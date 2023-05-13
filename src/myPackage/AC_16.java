package myPackage;

public class AC_16 {
    static void bubbleSortAscending(){
        // For Sorting in Ascending order
        // Time Complexity - O(n^2)
        int[] array1 = {7,8,3,2,1};
        for(int i=0;i<array1.length-1;i++){
            for(int j=0;j<array1.length-1-i;j++){
                if(array1[j]>array1[j+1]){
                    int k = array1[j];
                    array1[j]=array1[j+1];
                    array1[j+1]=k;
                }
            }
        }
        for(int element:array1){
            System.out.print(element+" ");
        }
    }
    static void bubbleSortDescending(){
        // For Sorting in Descending order
        // Time Complexity - O(n^2)
        int[] array2 = {2,8,1,7,3};
        for(int i=0;i<array2.length-1;i++){
            for(int j=array2.length-1;j>i;j--){
                if(array2[j]>array2[j-1]){
                    int k = array2[j];
                    array2[j]=array2[j-1];
                    array2[j-1]=k;
                }
            }
        }
        for(int element:array2){
            System.out.print(element+" ");
        }
    }
    static void selectionSort(){
        // Time Complexity - O(n^2)
        int[] array1 = {7,8,3,1,2};
        for(int i=0;i<array1.length-1;i++){
            int small =i;
            for(int j=i+1;j<array1.length;j++){
                if(array1[small]>array1[j]){
                    small=j;
                }
            }
            int temp = array1[small];
            array1[small] = array1[i];
            array1[i]=temp;
        }
        for(int element:array1){
            System.out.print(element+" ");
        }
    }
    static void insertionSort(){
        // Time Complexity -O(n^2)
        int[] array = {9,8,7,6,5,4,3,2,1};
        for(int i=1;i<array.length;i++){
            int current = array[i];
            int j = i-1;
            while(j>=0 && current<array[j]){
                array[j+1]=array[j];
                j--;
            }
            // Placement
            array[j+1]=current;
        }
        for(int element:array){
            System.out.print(element+" ");
        }
    }
    public static void main(String[] args) {
        // bubbleSortAscending();
        // bubbleSortDescending();
        // selectionSort();
        insertionSort();
    }
}
