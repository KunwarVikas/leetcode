package main.com.kv.leetcode.medium;

import java.util.PriorityQueue;

/**
 * Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.
 *
 * Example 1:
 *
 * Input: [3,2,1,5,6,4] and k = 2
 * Output: 5
 * Example 2:
 *
 * Input: [3,2,3,1,2,4,5,5,6] and k = 4
 * Output: 4
 * Note:
 * You may assume k is always valid, 1 ≤ k ≤ array's length.
 *
 * Accepted
 */
public class FindKthLargestElement215 {

    public static void main(String[] args) {
        FindKthLargestElement215 findKthLargestElement215 = new FindKthLargestElement215();
        System.out.println(findKthLargestElement215.findKthLargest(new int[]{3,2,1,5,6,4},3));
    }

    /**
     *
     * @param nums
     * @param k
     * @return
     */
    public int findKthLargest(int[] nums, int k) {
        if(nums.length ==0 || k==0){
            return -1;
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue();
        for(int i=0;i<nums.length;i++){
            minHeap.add(nums[i]);
            if(minHeap.size()>k){
                minHeap.remove();
            }
        }

        return minHeap.remove();
    }
}
