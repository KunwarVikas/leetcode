package main.com.kv.leetcode;

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
     * @return number which comes only once. others comes twice.
     */
    private static int findTheOddNumber(int[] nums) {
        if(nums.length==0){
            return -1;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0 ; i < nums.length ; i++){
            if(map.containsKey(nums[i])){
                int val = map.get(nums[i]);
                map.put(nums[i],++val);
            }else{
                map.put(nums[i],1);
            }
        }

        for(int key : map.keySet()){
            if(map.get(key)==1){
                return key;
            }
        }
        return -1;
    }
}
