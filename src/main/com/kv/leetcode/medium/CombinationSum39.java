package main.com.kv.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a set of candidate numbers (candidates) (without duplicates) and a target number (target), find all unique combinations in candidates where the candidate numbers sums to target.
 *
 * The same repeated number may be chosen from candidates unlimited number of times.
 *
 * Note:
 *
 * All numbers (including target) will be positive integers.
 * The solution set must not contain duplicate combinations.
 * Example 1:
 *
 * Input: candidates = [2,3,6,7], target = 7,
 * A solution set is:
 * [
 *   [7],
 *   [2,2,3]
 * ]
 * Example 2:
 *
 * Input: candidates = [2,3,5], target = 8,
 * A solution set is:
 * [
 *   [2,2,2,2],
 *   [2,3,3],
 *   [3,5]
 * ]
 *
 *
 * Constraints:
 *
 * 1 <= candidates.length <= 30
 * 1 <= candidates[i] <= 200
 * Each element of candidate is unique.
 * 1 <= target <= 500
 */
public class CombinationSum39 {

    public static void main(String[] args) {
        CombinationSum39 combinationSum39 = new CombinationSum39();
        System.out.println(combinationSum39.combinationSum(new int[]{2,3,5,7},7));
    }
    /**
     *
     * @param candidates
     * @param target
     * @return
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(candidates, 0, target, 0, temp, result);
        return result;
    }

    /**
     *
     * @param candidates
     * @param start
     * @param target
     * @param sum
     * @param list
     * @param result
     */
    private void helper(int[] candidates, int start, int target, int sum,
                        List<Integer> list, List<List<Integer>> result){
        if(sum>target){
            return;
        }

        if(sum==target){
            result.add(new ArrayList<>(list));
            return;
        }

        for(int i=start; i<candidates.length; i++){
            list.add(candidates[i]);
            helper(candidates, i, target, sum+candidates[i], list, result);
            list.remove(list.size()-1);
        }
    }
}
