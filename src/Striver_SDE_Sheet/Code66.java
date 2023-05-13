package Striver_SDE_Sheet;

public class Code66 {
    // Naive
    public static int ninjaAndLadoos1(int row1[], int row2[], int m, int n, int k) {
        int count = 0,i = 0,j = 0,res = 0;
        while(i< row1.length && j<row2.length){
            if(row1[i]<row2[j]){
                count++;
                if(count==k) return row1[i];
                i++;
            }
            else{
                count++;
                if(count==k) return row2[j];
                j++;
            }
        }
        while(i< row1.length){
            count++;
            if(count==k) return row1[i];
            i++;
        }
        while(j< row2.length){
            count++;
            if(count==k) return row2[j];
            j++;
        }
        return 0;
    }
    // Optimal
    public static int ninjaAndLadoos(int row1[], int row2[], int m, int n, int k) {
        if(n<m) return ninjaAndLadoos(row2,row1,n,m,k);
        int low = Math.max(0,k-n),high = Math.min(k,m);
        while(low<=high){
            int cnt1 = (high+low)/2;
            int cnt2 = k-cnt1;

            int l1 = cnt1==0? Integer.MIN_VALUE : row1[cnt1-1];
            int l2 = cnt2==0? Integer.MIN_VALUE : row2[cnt2-1];

            int r1 = cnt1==m? Integer.MAX_VALUE : row1[cnt1];
            int r2 = cnt2==n? Integer.MAX_VALUE : row2[cnt2];

            if(l1<=r2 && l2<=r1){
                return Math.max(l1,l2);
            }
            else if(l1>r2) high = cnt1-1;
            else low = cnt1+1;
        }
        return 1;
    }
    public static void main(String[] args) {
        int[] a = {1,3,6,7,10};
        int[] b = {3};
        System.out.println(ninjaAndLadoos(a,b,5,1,3));
    }
}
