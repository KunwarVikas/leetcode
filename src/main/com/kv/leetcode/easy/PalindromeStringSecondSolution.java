package main.com.kv.leetcode.easy;

import java.util.Scanner;

public class PalindromeStringSecondSolution {
    public static void main(String[] args) {
        boolean output = checkIfPalindrome("abcdcba");
        if(output) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }

    /**
     *
     * @param input
     * @return
     */
    private static boolean checkIfPalindrome(String input) {
        System.out.println(input);
        if("null".equals(input))
            return false;
        else{
           input = input.replaceAll("\\s", "");
           int i=0; int j = input.length()-1;
           while(i<j){
               if(input.charAt(i)!=input.charAt(j))
                   return false;
               i++;
               j--;
           }
        }
        return true;
    }
}
