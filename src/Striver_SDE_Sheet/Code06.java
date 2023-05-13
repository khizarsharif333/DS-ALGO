package Striver_SDE_Sheet;

public class Code06 {
    // Time limit Exceeded
    public int maxProfit1(int[] prices) {
        int[] array  = new int[prices.length-1];
        for(int i=0;i<prices.length-1;i++){
            int max = Integer.MIN_VALUE;
            for(int j=i+1;j< prices.length;j++) {
                if(prices[j] - prices[i]>max) max=prices[j] - prices[i];
            }
            array[i] = max;
        }
        int max = Integer.MIN_VALUE;
        for(int val:array){
            if(val>max) max=val;
        }
        return Math.max(max, 0);
    }

    public int maxProfit(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int maxiProfit = 0;
        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            maxiProfit = Math.max(maxiProfit, price - minPrice);
        }
        return maxiProfit;
    }
    public static void main(String[] args) {
        Code06 co = new Code06();
        int[] array= {7,1,5,3,6,4};
        System.out.println(co.maxProfit(array));
    }
}
