package main.com.kv.leetcode.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Given an array of size n, find the majority element.
 * The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 *
 * You may assume that the array is non-empty and the majority element always exist in the array.
 *
 * Example 1:
 *
 * Input: [3,2,3]
 * Output: 3
 * Example 2:
 *
 * Input: [2,2,1,1,1,2,2]
 * Output: 2
 */
public class MajorityElement169 {

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

        int result = findMajorityNumber(nums);
        System.out.println("The odd number is: "+result);
    }

    private static int findMajorityNumber(int[] nums) {
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
            if(map.get(key)>nums.length/2){
                return key;
            }
        }
        return -1;
    }

}
