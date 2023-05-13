package Striver_SDE_Sheet;

import java.util.Arrays;

public class Code45 {
    public static int jobScheduling(int[][] jobs) {
        Arrays.sort(jobs,(a,b) -> b[1]-a[1]);
        int maxiDeadLine = Integer.MIN_VALUE;
        for (int[] job : jobs) {
            maxiDeadLine = Math.max(maxiDeadLine, job[0]);
        }
        int[] result = new int[maxiDeadLine+1];
        Arrays.fill(result,-1);
        int profit = 0;
        for (int[] job : jobs) {
            for (int j = job[0]; j > 0; j--) {
                if (result[j] == -1) {
                    result[j] = job[0];
                    profit += job[1];
                    break;
                }
            }
        }
        System.out.println(Arrays.deepToString(jobs));
        System.out.println(Arrays.toString(result));
        return profit;
    }
    public static void main(String[] args) {
        int[][] jobs = {{4,50},{1,20},{1,30},{1,40},{3,50}};
        System.out.println(jobScheduling(jobs));
    }
}
