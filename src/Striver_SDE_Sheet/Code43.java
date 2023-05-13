package Striver_SDE_Sheet;

import java.util.*;

class meeting{
    int start ;
    int end ;
    int pos ;
    meeting(int start,int end,int pos){
        this.start = start;
        this.end = end;
        this.pos = pos;
    }
}
class meetingComparator implements Comparator<meeting>{
    @Override
    public int compare(meeting o1,meeting o2){
        if(o1.end<o2.end) return -1;
        else if(o1.end>o2.end) return 1;
        else if(o1.pos<o2.pos) return -1;
        return 0;
    }
}

public class Code43 {
    public static List<List<Integer>> converter(ArrayList<meeting> meet) {
        List<List<Integer>> list1 = new ArrayList<>();
        for (Striver_SDE_Sheet.meeting meeting : meet) {
            List<Integer> list = new ArrayList<>();
            list.add(meeting.start);
            list.add(meeting.end);
            list.add(meeting.pos);
            list1.add(list);
        }
        return list1;
    }
    public static List<Integer> maximumMeetings(int[] start, int[] end) {
        ArrayList<meeting> meet = new ArrayList<>();
        for(int i=0;i<start.length;i++){
            meet.add(new meeting(start[i],end[i],i+1));
        }
        //System.out.println(converter(meet));
        meetingComparator mc = new meetingComparator();
        Collections.sort(meet,mc);
        //System.out.println(converter(meet));
        List<Integer> answer = new ArrayList<>();
        answer.add(meet.get(0).pos);
        int limit = meet.get(0).end;
        for(int i=1;i<meet.size();i++){
            if(meet.get(i).start>limit){
                limit = meet.get(i).end;
                answer.add(meet.get(i).pos);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] start = {1,3,0,5,8,5};
        int[] end = {2,4,6,7,9,9};
        System.out.println(maximumMeetings(start,end));
    }
}