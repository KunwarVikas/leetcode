package main.com.kv.leetcode.easy;

import java.util.Arrays;

/**
 * 189. Rotate Array
 * Easy
 * Follow up:
 *
 * Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
 * Could you do it in-place with O(1) extra space?
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 * Example 2:
 *
 * Input: nums = [-1,-100,3,99], k = 2
 * Output: [3,99,-1,-100]
 * Explanation:
 * rotate 1 steps to the right: [99,-1,-100,3]
 * rotate 2 steps to the right: [3,99,-1,-100]
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 2 * 10^4
 * It's guaranteed that nums[i] fits in a 32 bit-signed integer.
 * k >= 0
 */
public class RotateArray189 {
    /**
     *
     * @param nums
     * @param k
     */
    public void rotate(int[] nums, int k) {
        if(k==0 || nums.length==0){
            return;
        }


        //with extra array
//        int[] a = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            a[(i+k)%nums.length]=nums[i];
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = a[i];
//        }

        //without extra space
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);

    }

    /**
     *
     * @param nums
     * @param start
     * @param end
     */
    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,4,5};
        int k =3;
        RotateArray189 rotateArray189 = new RotateArray189();
        rotateArray189.rotate(arr,k);
        Arrays.stream(arr).sequential().forEach(i-> System.out.println(i));
    }
}
