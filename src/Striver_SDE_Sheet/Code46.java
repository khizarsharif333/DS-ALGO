package Striver_SDE_Sheet;

import java.util.Arrays;
import java.util.Comparator;

class Pair
{
    int weight;
    int value;
    Pair(int weight, int value)
    {
        this.weight = weight;
        this.value = value;
    }
}
class pairComparator implements Comparator<Pair> {
    @Override
    public int compare(Pair o1,Pair o2){
        double r1 = (double)(o1.value)/(double)(o1.weight);
        double r2 = (double)(o2.value)/(double)(o2.weight);
        return Double.compare(r2, r1);
    }
}
public class Code46 {
    public static double maximumValue(Pair[] items, int n, int w) {
        Arrays.sort(items,new pairComparator());
        int curWeight = 0 ;
        double value = 0.0;
        for(int i=0;i<n;i++){
            if(curWeight + items[i].weight<=w){
                value+=items[i].value;
                curWeight += items[i].weight;
            }
            else{
                value += ((double)(items[i].value)/(double)(items[i].weight)*(double)(w-curWeight));
                break;
            }
        }
        return value;
    }
}
