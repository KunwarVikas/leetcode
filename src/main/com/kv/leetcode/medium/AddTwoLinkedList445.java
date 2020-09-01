package main.com.kv.leetcode.medium;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Example:
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 *
 * LeetCode 445
 * You are given two non-empty linked lists representing two non-negative integers.
 * The most significant digit comes first and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Follow up:
 * What if you cannot modify the input lists? In other words, reversing the lists is not allowed.
 *
 * Example:
 *
 * Input: (7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 8 -> 0 -> 7
 *
 */
public class AddTwoLinkedList445 {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<Integer>(Arrays.asList(7,2,4,8));
        LinkedList<Integer> l2 = new LinkedList<Integer>(Arrays.asList(5,6,4));
        LinkedList<Integer> resultList = addLinkedLists(l1,l2);
        Collections.reverse(resultList);
        for(int num:resultList){
            System.out.println(num);
        }
    }

    /**
     *
     * @param l1
     * @param l2
     */
    private static LinkedList<Integer> addLinkedLists(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        LinkedList<Integer> resultList = new LinkedList<>();
        int carry =0;
        int loopSize = Math.max(l1.size(), l2.size());
        for(int i=0; i< loopSize;i++) {
            int sum =0;
            if(i<l1.size() && l1.get(i)!=null){
                sum += l1.get(i);
            }
            if(i<l2.size() && l2.get(i)!=null){
                sum += l2.get(i);
            }
            sum += carry;
            carry = sum/10;
            sum = sum%10;
            resultList.add(sum);
        }
        return resultList;
    }
}
