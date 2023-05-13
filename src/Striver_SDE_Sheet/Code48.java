package Striver_SDE_Sheet;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
class activity{
    int start;
    int end ;
    activity(int start,int end){
        this.start = start;
        this.end = end;
    }
}
class activityComparator implements Comparator<activity> {
    @Override
    public int compare(activity a,activity b){
        return Integer.compare(a.end, b.end);
    }
}
public class Code48 {
    // To display
    public static List<List<Integer>> converter(ArrayList<activity> meet) {
        List<List<Integer>> list1 = new ArrayList<>();
        for (activity meeting : meet) {
            List<Integer> list = new ArrayList<>();
            list.add(meeting.start);
            list.add(meeting.end);
            list1.add(list);
        }
        return list1;
    }
    public static int maximumActivities(List<Integer> start, List<Integer> end) {
        ArrayList<activity> act = new ArrayList<>();
        for(int i=0;i<start.size();i++){
            act.add(new activity(start.get(i),end.get(i)));
        }
        System.out.println(converter(act));
        act.sort(new activityComparator());
        System.out.println(converter(act));
        int end1 = act.get(0).end ;
        int count =1;
        for(int i=1;i<act.size();i++){
            if(act.get(i).start>=end1){
                end1 = act.get(i).end;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> start = new ArrayList<>();
        List<Integer> end = new ArrayList<>();
        start.add(1);
        start.add(6);
        start.add(2);
        start.add(4);
        end.add(2);
        end.add(7);
        end.add(5);
        end.add(8);
        System.out.println(maximumActivities(start,end));
    }
}
