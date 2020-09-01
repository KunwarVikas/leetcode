package main.com.kv.leetcode.medium;

import java.util.HashMap;

public class SubArraySumEqualsK560 {
    public static void main(String[] args) {
        int [] arr = new int[] {3,4,3,4,3};
        int k = 7;
        System.out.println(subArraySum(arr,k));
    }

    /**
     *
     * @param nums
     * @param k
     * @return
     */
    public static int subArraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int count = 0;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int n = map.getOrDefault(sum-k,0);
            count+=n;
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
