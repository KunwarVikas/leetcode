package main.com.kv.leetcode.easy;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Enter the input for fibonacci series:");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int output = findFibonacciNumber(input);
        System.out.println("The fibonacci series for " +input+ " is: "+output);
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
