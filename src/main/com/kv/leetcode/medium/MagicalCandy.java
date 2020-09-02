package main.com.kv.leetcode.medium;

import java.util.PriorityQueue;

/**
 * You have N bags of candy. The ith bag contains arr[i] pieces of candy, and each of the bags is magical!
 * It takes you 1 minute to eat all of the pieces of candy in a bag (irrespective of how many pieces of candy are inside), and as soon as you finish, the bag mysteriously refills. If there were x pieces of candy in the bag at the beginning of the minute, then after you've finished you'll find that floor(x/2) pieces are now inside.
 * You have k minutes to eat as much candy as possible. How many pieces of candy can you eat?
 * Signature
 * int maxCandies(int[] arr, int K)
 * Input
 * 1 ≤ N ≤ 10,000
 * 1 ≤ k ≤ 10,000
 * 1 ≤ arr[i] ≤ 1,000,000,000
 * Output
 * A single integer, the maximum number of candies you can eat in k minutes.
 * Example 1
 * N = 5
 * k = 3
 * arr = [2, 1, 7, 4, 2]
 * output = 14
 * In the first minute you can eat 7 pieces of candy. That bag will refill with floor(7/2) = 3 pieces.
 * In the second minute you can eat 4 pieces of candy from another bag. That bag will refill with floor(4/2) = 2 pieces.
 * In the third minute you can eat the 3 pieces of candy that have appeared in the first bag that you ate.
 * In total you can eat 7 + 4 + 3 = 14 pieces of candy.
 */
public class MagicalCandy {
    public static void main(String[] args) {
        System.out.println(maxCandies(new int[]{2, 1, 7, 4, 2}, 3));
    }

    /**
     * @param arr
     * @param k
     * @return max candy can be eaten in K minutes
     */
    static int maxCandies(int[] arr, int k) {
        int sum=0;
        // Write your code here
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((x, y) -> Integer.compare(y, x));
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }

        for (int i = k-1; i >=0; i--) {
            int curItem=pq.peek();
            sum+=pq.poll();
            pq.add(curItem/2);
        }
        return sum;
    }
}