package main.com.kv.solution;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Example:
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
public class AddTwoLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<Integer>(Arrays.asList(5,6,5));
        LinkedList<Integer> l2 = new LinkedList<Integer>(Arrays.asList(5,6,5));
        addLinkedLists(l1,l2);
    }

    private static void addLinkedLists(LinkedList<Integer> l1, LinkedList<Integer> l2) {

    }

}
