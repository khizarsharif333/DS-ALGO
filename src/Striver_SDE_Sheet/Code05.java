package Striver_SDE_Sheet;

import java.util.Arrays;

public class Code05 {
    public static void swap(int[] num,int i,int j){
        int temp = num[i];
        num[i]=num[j];
        num[j]=temp;
    }
    public void sortColors2(int[] nums) {
        int red = 0;
        int white = 0;
        int blue = 0;
        for(int val:nums){
            if(val==0) red++;
            else if(val==1) white++;
            else blue++;
        }
        for(int i=1;i<=nums.length;i++){
            if(red>=1){
                nums[i-1]=0;
                --red;
                continue;
            }
            else if(white>=1){
                nums[i-1]=1;
                --white;
                continue;
            }
            else{
                nums[i-1]=2;
            }
        }
    }
    public void sortColors1(int[] num){
        for(int i=0;i<num.length;i++){
            int min = num[i];
            for(int j=i;j<num.length;j++){
                if(num[j]<min){
                    min=num[j];
                    swap(num,i,j);
                }
            }
        }
    }
    public void sortColors(int[] num){
        int low =0;
        int high = num.length-1;
        int mid =0;
        int temp;
        while(mid<=high){
            switch (num[mid]) {
                case 0 -> {
                    temp = num[low];
                    num[low] = num[mid];
                    num[mid] = temp;
                    low++;
                    mid++;
                }
                case 1 -> mid++;
                case 2 -> {
                    temp = num[high];
                    num[high] = num[mid];
                    num[mid] = temp;
                    high--;
                }
            }
        }
    }
    public static void main(String[] args) {
        Code05 co = new Code05();
        int[] array = {2,1,2,1,1,0};
        co.sortColors(array);
        System.out.println(Arrays.toString(array));
    }
}
