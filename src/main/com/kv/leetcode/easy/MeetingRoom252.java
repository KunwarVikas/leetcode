package main.com.kv.leetcode.easy;

import main.com.kv.leetcode.Interval;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Given an array of meeting time intervals consisting of start and end times [s1, e1], [s2, e2], ... ,
 * determine if a person could attend all meetings.
 *
 * For example,
 * Given [ [0, 30], [5, 10], [15, 20] ],
 * return false.
 */
public class MeetingRoom252 {
    public static void main(String[] args) {
        Interval[] intervals = new Interval[3];
        intervals[0] = new Interval(0, 30);
        intervals[1] = new Interval(5, 10);
        intervals[2] = new Interval(15, 20);
        System.out.println("A person can attend all the meetings:" + checkIfPersonCanAttendAll(intervals));
    }

    private static boolean checkIfPersonCanAttendAll(Interval[] intervals) {
        if (intervals == null || intervals.length == 0)
            return false;
        Arrays.sort(intervals,(a,b)->a.start-b.start);
        for(int i=0; i<intervals.length;i++){
            if(intervals[i].end > intervals[i+1].start){
                return false;
            }
        }
        return true;
    }
}
