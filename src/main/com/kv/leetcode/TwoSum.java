package main.com.kv.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */

public class TwoSum {
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
        System.out.println("Enter the target:");
        int target = sc.nextInt();
        int [] output = twoSum(nums,target);
        if(output.length==2)
        System.out.println("The words in order:" +output[0] +":" +output[1]);
    }

    /**
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        int [] result = new int[2];
        Map<Integer, Integer> numsMap = new HashMap<Integer, Integer>();
        for(int i=0 ;i<nums.length;i++){
            numsMap.put(nums[i],i);
        }
        for(int i=0 ;i<nums.length;i++){
            int rem = target-nums[i];
            if(numsMap.containsKey(rem) && numsMap.get(rem)!=i){
                return new int []{i, numsMap.get(rem)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }


}
