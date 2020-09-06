package main.com.kv.leetcode.easy;

import java.util.*;

/**
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 *
 * Note:
 *
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * Example 1:
 *
 * Input: [2,2,1]
 * Output: 1
 * Example 2:
 *
 * Input: [4,1,2,1,2]
 * Output: 4
 */
public class SingleNumberI136 {
    public static void main(String[] args) {
        int [] nums = new int[]{4,1,2,1,2};
        System.out.println("The odd number is: "+findTheOddNumber(nums));
    }

    /**
     *
     * @param nums
     * @return number which comes only once. others comes thrice
     */
    private static int findTheOddNumber(int[] nums) {
        if(nums.length==0){
            return -1;
        }

        List<Integer> dupList = new ArrayList<>();
        for(int num : nums){
            if(dupList.contains(num)){
                dupList.remove(new Integer(num));
            }else{
                dupList.add(num);
            }
        }
        return dupList!=null ? dupList.get(0):-1;
    }
}
