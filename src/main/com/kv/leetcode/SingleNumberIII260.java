package main.com.kv.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Given an array of numbers nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once.
 *
 * Example:
 *
 * Input:  [1,2,1,3,2,5]
 * Output: [3,5]
 * Note:
 *
 * The order of the result is not important. So in the above example, [5, 3] is also correct.
 * Your algorithm should run in linear runtime complexity. Could you implement it using only constant space complexity?
 */
public class SingleNumberIII260 {
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

        int [] result = findTheOddNumber(nums);
        System.out.println("The odd number is: "+result[0]+" "+result[1]);
    }

    /**
     *
     * @param nums
     * @return number which comes only once. others comes twice.
     */
    private static int [] findTheOddNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0 ; i < nums.length ; i++){
            if(map.containsKey(nums[i])){
                int val = map.get(nums[i]);
                map.put(nums[i],++val);
            }else{
                map.put(nums[i],1);
            }
        }
        int [] result = new int[2];
        int count =0;
        for(int key : map.keySet()){
            if(map.get(key)==1){
                result[count++] = key;
            }
        }
        return result;
    }
}
