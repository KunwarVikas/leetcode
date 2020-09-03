package main.com.kv.leetcode.hard;

import java.util.Arrays;

/**
 * Balanced Split
 * Given a set of integers (which may include repeated integers), determine if there's a way to split
 * the set into two subsets
 * A and B such that the sum of the integers in both sets is the same,
 * and all of the integers in A are strictly smaller than all of the integers in B.
 * Note: Strictly smaller denotes that every integer in A must be less than,
 * and not equal to, every integer in B.
 * Signature
 * bool balancedSplitExists(int[] arr)
 * Input
 * All integers in array are in the range [0, 1,000,000,000].
 * Output
 * Return true if such a split is possible, and false otherwise.
 *
 * *Example 1
 * arr = [1, 5, 7, 1]
 * output = true
 * We can split the set into A = {1, 1, 5} and B = {7}.
 * *
 *
 * Example 2
 * arr = [12, 7, 6, 7, 6]
 * output = false
 * We can't split the set into A = {6, 6, 7} and B = {7, 12} since this doesn't satisfy the requirement that all
 * integers in A are smaller than all integers in B.*
 */
public class BalancedSplit {
    public static void main(String[] args) {
        System.out.println(isBalancedSplit(new int []{1,5,7,1}));
    }

    /**
     *
     * @param nums
     * @return possibility of balanced split
     */
    private static boolean isBalancedSplit(int[] nums) {
        Arrays.sort(nums);
        int leftSum=0;
        int rightSum=0;
        for(int i=0;i<nums.length;i++){
            leftSum+=nums[i];
        }

        if(leftSum%2!=0){
            return false;
        }

        for(int i=nums.length-1;i>=0;i--){
            leftSum-=nums[i];
            rightSum+=nums[i];
            if(leftSum==rightSum && nums[i]>nums[i-1]){
                return true;
            }
        }
        return false;
    }
}
