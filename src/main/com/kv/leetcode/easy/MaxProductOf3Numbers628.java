package main.com.kv.leetcode.easy;

/**
 * Given an integer array, find three numbers whose product is maximum and output the maximum product.
 *
 * Example 1:
 *
 * Input: [1,2,3]
 * Output: 6
 *
 *
 * Example 2:
 *
 * Input: [1,2,3,4]
 * Output: 24
 *
 *
 * Note:
 *
 * The length of the given array will be in range [3,104] and all elements are in the range [-1000, 1000].
 * Multiplication of any three numbers in the input won't exceed the range of 32-bit signed integer.
 */
public class MaxProductOf3Numbers628 {

    public static void main(String[] args) {
        System.out.println(maximumProduct(new int[]{5,5,5,5,2,4-1,-2,2}));
    }

    /**
     *
     * @param nums
     * @return
     */
    public static int maximumProduct(int[] nums) {
        if(nums.length<3){
            return -1;
        }
        if(nums.length==3){
            return nums[0]*nums[1]*nums[2];
        }
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        for(int i=0; i<nums.length;i++) {
            if (nums[i] <= min1) {
                min2 = min1;
                min1 = nums[i];
            } else if (nums[i] <= min2) {     // n lies between min1 and min2
                min2 = nums[i];
            }
            if (nums[i] >= max1) {            // n is greater than max1, max2 and max3
                max3 = max2;
                max2 = max1;
                max1 = nums[i];
            } else if (nums[i] >= max2) {     // n lies betweeen max1 and max2
                max3 = max2;
                max2 = nums[i];
            } else if (nums[i] >= max3) {     // n lies betwen max2 and max3
                max3 = nums[i];
            }
        }
        return Math.max(min1 * min2 * max1, max1 * max2 * max3);
    }
}
