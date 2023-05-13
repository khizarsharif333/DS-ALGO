// Merge Sort - Time Complexity nLogN
package myPackage;

public class AC_22 {
    static void conquer(int[] array , int si , int mid, int ei){
        int[] merged = new int[ei-si+1];
        int ind1 = si;
        int ind2 = mid+1;
        int x =0;
        while(ind1<=mid && ind2<=ei){
            if(array[ind1]<array[ind2]) merged[x++]=array[ind1++];
            else merged[x++]=array[ind2++];
        }
        while(ind1<=mid) merged[x++]=array[ind1++];
        while(ind2<=ei) merged[x++]=array[ind2++];
        for(int i=0,j=si;i<merged.length;i++,j++){
            array[j]=merged[i];
        }
    }
    static void divide(int[] array,int si,int ei){
        if(si>=ei){
            return;
        }
        int mid = si +(ei-si)/2;
        divide(array,si,mid);
        divide(array,mid+1,ei);
        conquer(array,si,mid,ei);
    }
    public static void main(String[] args) {
        int[] array = {6,3,9,5,2,8};
        int n= array.length;
        divide(array,0,n-1);
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
