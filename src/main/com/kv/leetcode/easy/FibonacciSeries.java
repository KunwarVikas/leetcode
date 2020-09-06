package main.com.kv.leetcode.easy;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int input = 7;
        System.out.println("The fibonacci series for " +input+ " is: "+findFibonacciNumber(7));
    }

    /**
     *
     * @param input
     * @return
     */
    private static int findFibonacciNumber(int input) {
        if(input < 0){
            return -1;
        }
        if (input <= 1){
            return input;
        }
        return findFibonacciNumber(input-1)+findFibonacciNumber(input-2);
    }


}
