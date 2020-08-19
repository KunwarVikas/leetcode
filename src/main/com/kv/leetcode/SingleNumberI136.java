package main.com.kv.leetcode;

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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers using space:");
        String words = sc.nextLine();
        String [] numbers = words.split("\\s+");
        int [] nums = new int[numbers.length];
        int count=0;
        for(String num : numbers){
            nums[count++]=Integer.parseInt(num);
        }
        
        int result = findTheOddNumber(nums);
        System.out.println("The odd number is: "+result);
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
