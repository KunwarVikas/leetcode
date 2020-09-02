package main.com.kv.leetcode.easy;

import java.util.Scanner;

/**
 * The Hamming distance between two integers is the number of positions at
 * which the corresponding bits are different.
 *
 * Given two integers x and y, calculate the Hamming distance.
 *
 * Note:
 * 0 ≤ x, y < 231.
 *
 * Example:
 *
 * Input: x = 1, y = 4
 *
 * Output: 2
 *
 * Explanation:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 *        ↑   ↑
 *
 * The above arrows point to positions where the corresponding bits are different.
 */
public class HammingDistance461 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first int:");
        int i1 = sc.nextInt();
        System.out.println("Enter the second int:");
        int i2 = sc.nextInt();
        int output = checkHummingDistance(i1,i2);
        System.out.println("The humming distance:" +output);
    }

    private static int checkHummingDistance(int x, int y) {
        int result = 0;
        while(x>0 || y>0){
            result += (x%2)^(y%2); //if they are different add 1 to result.
            x >>= 1; //dividing by 2
            y >>= 1;
        }
        return result;
    }

}
