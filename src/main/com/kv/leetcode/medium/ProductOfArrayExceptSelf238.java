package main.com.kv.leetcode.medium;

import java.util.Arrays;

/**
 * Given an array nums of n integers where n > 1,
 * return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
 *
 * Example:
 *
 * Input:  [1,2,3,4]
 * Output: [24,12,8,6]
 * Constraint: It's guaranteed that the product of the elements of
 * any prefix or suffix of the array (including the whole array) fits in a 32 bit integer.
 *
 * Note: Please solve it without division and in O(n).
 *
 * Follow up:
 * Could you solve it with constant space complexity?
 * (The output array does not count as extra space for the purpose of space complexity analysis.)
 */
public class ProductOfArrayExceptSelf238 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1,2,3,4})));
    }

    /**
     *
     * @param nums
     * @return
     */
    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        int[] t1 = new int[nums.length]; //pre-multiplication, first element always 1
        int[] t2 = new int[nums.length]; //post-multiplication, last element always 1

        t1[0]=1;
        t2[nums.length-1]=1;

        //scan from left to right
        for(int i=0; i<nums.length-1; i++){
            t1[i+1] = nums[i] * t1[i];
            System.out.println(t1[i+1]);
        }
        //scan from right to left
        for(int i=nums.length-1; i>0; i--){
            t2[i-1] = t2[i] * nums[i];
            System.out.println(t2[i-1]);
        }

        //multiply
        for(int i=0; i<nums.length; i++){
            result[i] = t1[i] * t2[i];
            System.out.println(result[i]);
        }

        return result;
    }

}
