package main.com.kv.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 22. Generate Parentheses
 * Medium
 *
 * 5761
 *
 * 287
 *
 * Add to List
 *
 * Share
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 *
 * For example, given n = 3, a solution set is:
 *
 * [
 *   "((()))",
 *   "(()())",
 *   "(())()",
 *   "()(())",
 *   "()()()"
 * ]
 */
public class GenerateParenthesis22 {
    public static void main(String[] args) {
        GenerateParenthesis22 gp = new GenerateParenthesis22();
        List<String> list = gp.generateParenthesis(3);
        list.forEach(s-> System.out.println(s));
    }

    public List<String> generateParenthesis(int n) {
        ArrayList<String> result = new ArrayList<String>();
        dfs(result, "", n, n);
        return result;
    }
    /*
    left and right represents the remaining number of ( and ) that need to be added.
    When left > right, there are more ")" placed than "(". Such cases are wrong and the method stops.
    */
    public void dfs(ArrayList<String> result, String s, int left, int right){
        if(left > right)
            return;

        if(left==0&&right==0){
            result.add(s);
            return;
        }

        if(left>0){
            dfs(result, s+"(", left-1, right);
        }

        if(right>0){
            dfs(result, s+")", left, right-1);
        }
    }
}
