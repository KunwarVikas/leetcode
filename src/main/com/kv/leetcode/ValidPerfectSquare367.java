package main.com.kv.leetcode;

/**
 * Given a positive integer num, write a function which returns True if num is a perfect square else False.
 *
 * Follow up: Do not use any built-in library function such as sqrt.
 *
 *
 *
 * Example 1:
 *
 * Input: num = 16
 * Output: true
 * Example 2:
 *
 * Input: num = 14
 * Output: false
 *
 *
 * Constraints:
 *
 * 1 <= num <= 2^31 - 1
 */
public class ValidPerfectSquare367 {
    public static void main(String[] args) {
        int A = 2147395600;
        System.out.println(A);
        System.out.println(sqrt(A));
    }

    /**
     *
     * @param
     * @return if it is perfcet square
     */
    private static boolean sqrt(int num) {
        long left = 0, right = num;
        while (left <= right) {
            long mid = left + (right - left) / 2, t = mid * mid;
            if (t == num) return true;
            else if (t < num) left = mid + 1;
            else right = mid - 1;
        }
        return false;
     }
}

