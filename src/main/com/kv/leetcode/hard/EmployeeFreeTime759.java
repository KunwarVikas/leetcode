package main.com.kv.leetcode.hard;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * We are given a list schedule of employees, which represents the working time for each employee.
 * Each employee has a list of non-overlapping Intervals, and these intervals are in sorted order.
 * Return the list of finite intervals representing common, positive-length free time for all employees, also in sorted order.
 * Example 1:
 * Input: schedule = [[[1,2],[5,6]],[[1,3]],[[4,10]]]
 * Output: [[3,4]]
 * Explanation:
 * There are a total of three employees, and all common
 * free time intervals would be [-inf, 1], [3, 4], [10, inf].
 * We discard any intervals that contain inf as they aren't finite.
 * Example 2:
 * Input: schedule = [[[1,3],[6,7]],[[2,4]],[[2,5],[9,12]]]
 * Output: [[5,6],[7,9]]
 * (Even though we are representing Intervals in the form [x, y], the objects inside are Intervals, not lists or arrays. For example, schedule[0][0].start = 1, schedule[0][0].end = 2, and schedule[0][0][0] is not defined.)
 * Also, we wouldn't include intervals like [5, 5] in our answer, as they have zero length.
 * Note:
 * schedule and schedule[i] are lists with lengths in range [1, 50].
 * 0 <= schedule[i].start < schedule[i].end <= 10^8.
 */
public class EmployeeFreeTime759 {
    public static void main(String[] args) {
        //[[[1,2],[5,6]],[[1,3]],[[4,10]]]
        Interval i1 = new Interval(1,2);
        Interval i2 = new Interval(5,6);
        Interval i3 = new Interval(1,3);
        Interval i4 = new Interval(4,10);
        List<Interval> list1 = new ArrayList<>();
        List<Interval> list2 = new ArrayList<>();
        List<Interval> list3 = new ArrayList<>();
        list1.add(i1);
        list1.add(i2);
        list2.add(i3);
        list3.add(i4);
        List<List<Interval>> mainList = new ArrayList<>();
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);
        employeeFreeTime(mainList);
        System.out.println("Done");
    }

    /**
     *
     * @param schedule
     * @return
     */
    public static List<Interval> employeeFreeTime(List<List<Interval>> schedule){
        PriorityQueue<Interval> priorityQueue = new PriorityQueue<>((a, b) -> a.start - b.start);
        for (List<Interval> list : schedule) {
            for (Interval i : list) {
                priorityQueue.add(i);
            }
        }
        List<Interval> freeIntervals = new ArrayList<>();
        int max = -1;
        while (!priorityQueue.isEmpty()) {
            Interval top = priorityQueue.poll();
            if (max != -1 && top.start > max) {
                freeIntervals.add(new Interval(max, top.start));
            }
            max = Math.max(max, top.end);
        }
        return freeIntervals;
    }


}

/**
 *
 */
 class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
 }