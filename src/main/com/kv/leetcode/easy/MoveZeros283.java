package main.com.kv.leetcode.easy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 *
 * Example:
 *
 * Input: [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * Note:
 *
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 */
public class MoveZeros283 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers using space:");
        String words = sc.nextLine();
        String [] numbers = words.split("\\s");
        int [] nums = new int[numbers.length];
        int count=0;
        for(String num : numbers){
            nums[count++]=Integer.parseInt(num);
        }
        int [] output = moveZeros(nums);
        for(int num : nums)
        System.out.println(num);
    }

    private static int[] moveZeros(int[] nums) {
        int index = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[index++]=nums[i];
            }
        }
        for(int i=index;i<nums.length;i++){
            nums[i]=0;
        }
        return nums;
    }
}
