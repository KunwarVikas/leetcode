package main.com.kv.leetcode.easy;

import main.com.kv.leetcode.Interval;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingRoomII253 {
    public static void main(String[] args) {
        Interval[] intervals = new Interval[3];
        intervals[0] = new Interval(0, 30);
        intervals[1] = new Interval(5, 10);
        intervals[2] = new Interval(15, 20);
        MeetingRoomII253 meetingRoomII253 = new MeetingRoomII253();
        System.out.println("Meeting Room Required:" + meetingRoomII253.minMeetingRooms(intervals));
    }

    /**
     *
     * @param intervals
     * @return minimum number of rooms required.
     */
    public int minMeetingRooms(Interval[] intervals) {
        if(intervals==null || intervals.length==0){
            return 0;
        }
        int rooms=0;
        Arrays.sort(intervals,(a,b)->a.start-b.start);
        PriorityQueue<Interval> minHeap = new PriorityQueue<>((a,b)->a.end-b.end);
        minHeap.add(intervals[0]);
        for(int i=0;i<intervals.length;i++){
            Interval current = intervals[i];
            Interval earliest = minHeap.remove();
            if(current.start>=earliest.end){
                earliest.end=current.end;
            }else{
                minHeap.add(current);
            }
            minHeap.add(earliest);
        }
        return  minHeap.size();
    }
}
