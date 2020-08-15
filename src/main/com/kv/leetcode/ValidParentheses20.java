package main.com.kv.leetcode;

import java.util.Scanner;
import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.
 *
 * Example 1:
 *
 * Input: "()"
 * Output: true
 * Example 2:
 *
 * Input: "()[]{}"
 * Output: true
 * Example 3:
 *
 * Input: "(]"
 * Output: false
 * Example 4:
 *
 * Input: "([)]"
 * Output: false
 * Example 5:
 *
 * Input: "{[]}"
 * Output: true
 */
public class ValidParentheses20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s1 = sc.next();
        boolean output = checkIfValidParentheses(s1);
        System.out.println("The string is valid parentheses:" +output);
    }

    /**
     *
     * @param s1
     * @return
     */
    private static boolean checkIfValidParentheses(String s1) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)=='(' ||s1.charAt(i)=='{' ||s1.charAt(i)=='['){
                stack.push(s1.charAt(i));
            }else if(s1.charAt(i)==')' && !stack.isEmpty() && stack.peek()=='('){
                stack.pop();
            }else if(s1.charAt(i)=='}' && !stack.isEmpty() && stack.peek()=='{'){
                stack.pop();
            }else if(s1.charAt(i)==']' && !stack.isEmpty() && stack.peek()=='['){
                stack.pop();
            }else{
                return false;
            }
        }
        return stack.isEmpty();
    }

}
