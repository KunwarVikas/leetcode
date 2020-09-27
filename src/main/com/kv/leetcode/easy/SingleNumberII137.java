package main.com.kv.leetcode.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Given a non-empty array of integers, every element appears three times except for one,
 * which appears exactly once. Find that single one.
 *
 * Note:
 *
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * Example 1:
 *
 * Input: [2,2,3,2]
 * Output: 3
 * Example 2:
 *
 * Input: [0,1,0,1,0,1,99]
 * Output: 99
 *
 * Trying to solve it using hashmap
 *
 */
public class SingleNumberII137 {
    public static void main(String[] args) {
        int [] nums = new int[]{0,1,0,1,0,1,99};
        System.out.println("The odd number is: "+findTheOddNumber(nums));
    }

    /**
     *
     * @param nums
     * @return number which comes only once. others comes twice.
     */
    private static int findTheOddNumber(int[] nums) {
        if(nums.length==0){
            return -1;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0 ; i < nums.length ; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        for(int key : map.keySet()){
            if(map.get(key)==1){
                return key;
            }
        }
        return -1;
    }
}
